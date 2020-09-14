package br.com.cam.automacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.cam.bean.GrupoBean;
import br.com.cam.dao.DBConnection;
import br.com.cam.dao.GerenciarOrdemDAO;

public class Program {
	
	
	public static void main(String[] args) throws SQLException {
		
			List<GrupoBean> grupos = new ArrayList<GrupoBean>();
			Connection con = null;
			GerenciarOrdemDAO go = new GerenciarOrdemDAO();

			con = DBConnection.getConexaoSQL();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT\r\n" + 
					"A.EXTERNAL_KEY ORDEM, A.SUBID_2, A.ACC_CHANNEL_NAME CANAL, A.ACTION ACAO, A.STATUS_TEXT STATUS_ORDEM, A.PROCESSING_STATUS_TEXT PROCESSAMENTO,\r\n" + 
					"B.STATUS STATUS_TRANSACAO, B.ACTION ACAO_TRANSACAO, B.CLIENT_ERROR_CODE ERRO, B.ERROR_MESSAGE DS_ERRO, A.DATE_CREATED DATA, A.SERVICE_ORDER\r\n" + 
					"FROM FSD_MAINT A JOIN FSD_TRANSACTIONS B ON A.ORDER_ID = B.ORDER_ID\r\n" + 
					"WHERE 1=1\r\n" + 
					"AND A.SUBID_2 IN ('17991843555')\r\n" + 
					"ORDER BY A.DATE_CREATED DESC;");

			while (rs.next()) {

				String cam_order = rs.getString("ordem");
				String numero = rs.getString("subid_2");
				String canal = rs.getString("canal");
				String acao = rs.getString("acao");
				String status_ordem = rs.getString("status_ordem");
				String processamento = rs.getString("processamento");
				String data = rs.getString("data");
				String service_order = rs.getString("service_order");
				String status_transacao = rs.getString("status_transacao");
				String acao_transacao = rs.getString("acao_transacao");
				String erro = rs.getString("erro");
				String ds_erro = rs.getString("ds_erro");

				grupos.add(new GrupoBean(cam_order, numero, canal, acao, status_ordem, processamento, status_transacao, acao_transacao, erro,ds_erro,data, service_order));
				
				//grupos.add(new GrupoBean(cam_order, numero, canal, acao, status_ordem, processamento, data, service_order));

			}

			rs.close();
			stmt.close();
			con.close();

			
			for (GrupoBean grupoBean : grupos) {
				
				String[] st = grupoBean.getData().split(" ");
				
				String[] data = st[0].split("-");
				
				
				String hora = st[1];
							
				
				System.out.println(st[0]);
				System.out.println(st[1]);
				
			}
		
		
	}	
	
	
	
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Login login = new Login();
		ConnectCAM connect = new ConnectCAM();
		GerenciarOrdem acessarOrdens = new GerenciarOrdem();

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver cam = new ChromeDriver();

		login.getCredential();

		connect.logar(login, cam);
		//acessarOrdens.acessar(cam);
		//acessarOrdens.searchOrders(cam);
		///acessarOrdens.acessarLinha("11979959494", cam);

	}
*/
}
