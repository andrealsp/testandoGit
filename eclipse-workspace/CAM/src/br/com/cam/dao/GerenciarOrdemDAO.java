package br.com.cam.dao;

import java.security.acl.LastOwnerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.cam.automacao.GerenciarOrdem;
import br.com.cam.automacao.ConnectCAM;
import br.com.cam.automacao.Login;
import br.com.cam.automacao.Ordem;
import br.com.cam.bean.GrupoBean;

public class GerenciarOrdemDAO {

	public void gerenciarCAM() {

		Login login = new Login();
		ConnectCAM connect = new ConnectCAM();
		GerenciarOrdem acessarOrdens = new GerenciarOrdem();

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver cam = new ChromeDriver();

		login.getCredential();

		connect.logar(login, cam);

	}

	// Método Conecta com a base do CAM para extrair dados necessários para ativação
	// da linha
	public List<GrupoBean> buscaBaseNCAM(String linha) throws Exception {
		List<GrupoBean> grupos = new ArrayList<GrupoBean>();
		Connection con = null;

		con = DBConnection.getConexaoSQL();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT\r\n"
				+ "A.EXTERNAL_KEY ORDEM, A.SUBID_2, A.ACC_CHANNEL_NAME CANAL, A.ACTION ACAO, A.STATUS_TEXT STATUS_ORDEM, A.PROCESSING_STATUS_TEXT PROCESSAMENTO,\r\n"
				+ "A.DATE_CREATED DATA, A.SERVICE_ORDER\r\n" + "FROM FSD_MAINT A WHERE A.SUBID_2 IN ('" + linha
				+ "') ORDER BY A.DATE_CREATED DESC");

		while (rs.next()) {

			String cam_order = rs.getString("ordem");
			String numero = rs.getString("subid_2");
			String canal = rs.getString("canal");
			String acao = rs.getString("acao");
			String status_ordem = rs.getString("status_ordem");
			String processamento = rs.getString("processamento");
			String data = rs.getString("data");
			String service_order = rs.getString("service_order");

			grupos.add(new GrupoBean(cam_order, numero, canal, acao, status_ordem, processamento, data, service_order));

		}

		rs.close();
		stmt.close();
		con.close();

		return grupos;

	}

	// Metódo utiliza dados extraídos do método buscaBaseNCAM
	// para separar a ordem com falha, última ordem válida no Canal
	// e possíveis ordens excecutadas no ServPack entre a ordem com falha e última
	// ordem válida
	public List<Ordem> buscarOrdens(List<GrupoBean> baseOrdens) {
		// TODO Auto-generated method stub
		List<Ordem> ordens = new ArrayList<Ordem>();

		for (GrupoBean string : baseOrdens) {

			if (string.getCam_ordem().contains("_")) {

				if (string.getStatus_ordem().equals("Failed") && ordens.isEmpty()) {

					if (string.getCam_ordem().contains("_")) {

						String[] st = string.getCam_ordem().split("_");
						String[] stg = st[1].split("-");

						ordens.add(new Ordem(st[2], stg[2], string.getCanal(), string.getStatus_ordem(),
								string.getAcao(), string.getErro()));
					}

				}

				if (string.getStatus_ordem().equals("Successful")) {

					if (string.getCanal().equals("ServPack")) {
						String[] st = string.getCam_ordem().split("_");
						String[] stg = st[1].split("-");

						ordens.add(new Ordem(st[2], stg[2], string.getCanal(), string.getStatus_ordem(),
								string.getAcao(), string.getErro()));

					}

					if (string.getCanal().equals("Controle") || string.getCanal().equals("PostPaid")) {

						if (string.getAcao().equals("suspend")) {
							String[] st = string.getCam_ordem().split("_");
							String[] stg = st[1].split("-");

							ordens.add(new Ordem(st[2], stg[2], string.getCanal(), string.getStatus_ordem(),
									string.getAcao(), string.getErro()));

						}
						if (string.getAcao().equals("change") || string.getAcao().equals("reinstate")
								|| string.getAcao().equals("activate") || string.getAcao().equals("cancel")) {

							String[] st = string.getCam_ordem().split("_");
							String[] stg = st[1].split("-");

							ordens.add(new Ordem(st[2], stg[2], string.getCanal(), string.getStatus_ordem(),
									string.getAcao(), string.getErro()));

							break;
						}
					}
				}

			}

		}

		return ordens;

	}

	public void gerenciarOrdens(List<Ordem> ordens, String linha, WebDriver cam) {

		int ultimaPosicao = ordens.size() - 1;

		GerenciarOrdemDAO go = new GerenciarOrdemDAO();

		// cenário 1 - Canal da Ultima ordem valida é diferente do Canal da ordem com
		// falha
		// Migração de pós para controle ou controle para pós
		if (ordens.get(ultimaPosicao).getCanal() != ordens.get(0).getCanal()) {

			boolean bol = go.ativarOrdem(ordens.get(0), linha, cam);

			if (bol == true) {
				System.out.println("Linha ativada pela ordem pendente. Efetuar Skip_step do passo "
						+ ordens.get(0).getPasso() + "para a ordem " + ordens.get(0).getOrdem());
			} else {
				System.out.println("Ativação no CAM apresentou falha. Verificar erro no CAM.");
			}
			
		}
		
		else {
			boolean bol = go.ativarOrdem(ordens.get(ultimaPosicao), linha, cam);
			
			if (bol == true) {

				if (ordens.get(ultimaPosicao-1).getAcao().equals("suspend")) {
					
					
					
				}
				
				
			} else {
				System.out.println("Ativação no CAM apresentou falha. Verificar erro no CAM.");
			}
			
		}

	}

	private boolean ativarOrdem(Ordem ordem, String linha, WebDriver cam) {
		// TODO Auto-generated method stub

		return true;
	}

	// ativa uma linha por uma ordem de suspensão e reenvia a suspensão pelo CAM

}
