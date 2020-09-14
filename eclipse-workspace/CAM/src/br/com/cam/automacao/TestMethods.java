package br.com.cam.automacao;

import java.util.List;

import br.com.cam.dao.GerenciarOrdemDAO;

public class TestMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Ordem o1 = new Ordem("3142026086A", "00", "PostPaid", "Failed", "cancel");
		 * Ordem o2 = new Ordem("3142026086A", "00", "PostPaid", "Failed", "cancel");
		 * Ordem o3 = new Ordem("3139442887A", "01", "ServPack", "Successful",
		 * "cancel"); Ordem o4 = new Ordem("3139442887A", "02", "ServPack",
		 * "Successful", "cancel"); Ordem o5 = new Ordem("3139442887A", "00",
		 * "PostPaid", "Successful", "change");
		 * 
		 * 
		 * List<Ordem> ordens = new ArrayList<Ordem>(); ordens.add(o1); ordens.add(o2);
		 * ordens.add(o3); ordens.add(o4); ordens.add(o5);
		 * 
		 * GerenciarOrdem go = new GerenciarOrdem();
		 * 
		 * String st = go.iniciarGerenciamentoOrdem(ordens, linha);
		 * 
		 * if (!st.isEmpty()) { System.out.println("Use a ferramenta " + st); }
		 * 
		 * }
		 */

		GerenciarOrdem go = new GerenciarOrdem();
		GerenciarOrdemDAO goDAO = new GerenciarOrdemDAO();

		String[] linhas = { "11962996336" };

		for (String linha : linhas) {
			List<Ordem> ordens = goDAO.buscaBaseNCAM(linha);

			for (int i = 0; i < ordens.size(); i++) {
				System.out.println(ordens.get(i));
			}

			String st = go.iniciarGerenciamentoOrdem(ordens, linha);

			if (!st.isEmpty()) {
				System.out.println("Use a ferramenta " + st);
			}
		}

		// -------------------------------

		/*
		 * GerenciarOrdemController goc = new GerenciarOrdemController();
		 * 
		 * Login login = new Login(); ConnectCAM connect = new ConnectCAM();
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\WebDriver\\bin\\chrome\\chromedriver.exe"); WebDriver cam = new
		 * ChromeDriver();
		 * 
		 * login.getCredential();
		 * 
		 * connect.logar(login, cam);
		 * 
		 * Ordem ordem = new Ordem(); ordem.setCanal("Controle");
		 * 
		 * goc.acessar(cam); goc.acessarCanal(ordem, cam);
		 * goc.acessarLinha("79998085673", cam);
		 * 
		 * cam.getCurrentUrl();
		 * 
		 * cam.switchTo().frame("main");
		 * 
		 * new WebDriverWait(cam, 2).until(
		 * ExpectedConditions.elementToBeClickable(By.xpath(
		 * "/html/body/table[5]/tbody/tr/td[2]/button/img")));
		 * 
		 * String string =
		 * cam.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[3]/font")).getText(
		 * );
		 * 
		 * String[] stg = string.split(" "); int j = Integer.parseInt(stg[4]);
		 * 
		 * System.out.println(j);
		 */
	}
}
