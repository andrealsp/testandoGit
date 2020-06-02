package br.com.cam.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cam.automacao.Ordem;
import br.com.cam.bean.GrupoBean;

public class GerenciarOrdemDAO {

	// Método Conecta com a base do CAM para extrair dados necessários para ativação da linha
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

			String cam_order = new String(rs.getString("ordem"));
			String numero = new String(rs.getString("subid_2"));
			String canal = new String(rs.getString("canal"));
			String acao = new String(rs.getString("acao"));
			String status_ordem = new String(rs.getString("status_ordem"));
			String processamento = new String(rs.getString("processamento"));
			String data = new String(rs.getString("data"));
			String service_order = new String(rs.getString("service_order"));

			grupos.add(new GrupoBean(cam_order, numero, canal, acao, status_ordem, processamento, data, service_order));

		}

		rs.close();
		stmt.close();
		con.close();

		return grupos;

	}

	
	// Metódo utiliza dados extraídos do método buscaBaseNCAM 
	// para separar a ordem com falha, última ordem válida no Canal 
	// e possíveis ordens excecutadas no ServPack entre a ordem com falha e última ordem válida
	public List<Ordem> buscarOrdens(List<GrupoBean> baseOrdens) {
		// TODO Auto-generated method stub
		List<Ordem> ordens = new ArrayList<Ordem>();

		for (GrupoBean string : baseOrdens) {

			if (string.getStatus_ordem().equals("Failed")) {
				String[] st = string.getCam_ordem().split("_");
				String[] stg = st[1].split("-");				
				
				ordens.add(new Ordem(st[2],stg[1],string.getCanal(),string.getAcao()));
			}

			break;
		}

		for (GrupoBean string : baseOrdens) {

			if (string.getStatus_ordem().equals("Successful")) {

				if (string.getCanal().equals("Controle") || string.getCanal().equals("PostPaid")) {
					String[] st = string.getCam_ordem().split("_");
					String[] stg = st[1].split("-");				
					
					ordens.add(new Ordem(st[2],stg[1],string.getCanal(),string.getAcao()));
					break;
					
				} if (string.getCanal().equals("ServPack")){
					String[] st = string.getCam_ordem().split("_");
					String[] stg = st[1].split("-");				
					
					ordens.add(new Ordem(st[2],stg[1],string.getCanal(),string.getAcao()));
				}

			}
		}
		
		return ordens;

	}
	
	

}
