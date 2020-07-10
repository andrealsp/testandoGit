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
import br.com.cam.controller.GerenciarOrdemController;

public class GerenciarOrdemDAO {

	// M�todo Conecta com a base do CAM para extrair dados necess�rios para ativa��o
	// da linha
	public List<Ordem> buscaBaseNCAM(String linha) throws Exception {
		List<GrupoBean> grupos = new ArrayList<GrupoBean>();
		Connection con = null;
		GerenciarOrdemDAO go = new GerenciarOrdemDAO();

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

		return go.buscarOrdens(grupos);

	}

	// Met�do utiliza dados extra�dos do m�todo buscaBaseNCAM
	// para separar a ordem com falha, �ltima ordem v�lida no Canal
	// e poss�veis ordens excecutadas no ServPack entre a ordem com falha e �ltima
	// ordem v�lida
	private List<Ordem> buscarOrdens(List<GrupoBean> baseOrdens) {
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

	// inicia e gerencia intera��es com a aplica��o do CAM
	public boolean gerenciarCAM(Ordem ordem, String linha) {

		boolean bol;
		Login login = new Login();
		ConnectCAM connect = new ConnectCAM();
		GerenciarOrdemController goc = new GerenciarOrdemController();

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver cam = new ChromeDriver();

		login.getCredential();

		connect.logar(login, cam);
		goc.acessar(cam);
		goc.acessarCanal(ordem, cam);
		goc.acessarLinha(linha, cam);

		if (ordem.getCanal().equals("ServPack")) {
			bol = goc.acessarTransacaoOrdem(ordem, cam);
		} else {
			bol = goc.acessarOrderAction(ordem, cam);
		}

		return bol;

	}

}
