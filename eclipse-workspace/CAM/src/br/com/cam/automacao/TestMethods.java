package br.com.cam.automacao;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.cam.bean.GrupoBean;
import br.com.cam.dao.GerenciarOrdemDAO;

public class TestMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		GerenciarOrdemDAO ordens = new GerenciarOrdemDAO();
		String linha = "71999408765";
		List<GrupoBean> baseOrdens = ordens.buscaBaseNCAM(linha);

		// List<Ordem> grupoOrdens = ordens.buscarOrdens(baseOrdens);

		// ordens.gerenciarOrdens(grupoOrdens, linha,cam);

		// int i;
		// int n = baseOrdens.size();

		// try {

		// for (i = 0; i < n; i++) {

		// System.out.printf("Posição %d\n", i);
		// System.out.printf("Ordem %s\n", baseOrdens.get(i).getCam_ordem());
		// System.out.printf("Canal %s\n", baseOrdens.get(i).getCanal());
		// System.out.printf("Ação %s\n", baseOrdens.get(i).getAcao());
		// System.out.println("\n");
		// }
		// } catch (Exception e) {
		// System.out.println("Ocorreu um erro " + e);
		// }

		List<Ordem> ordem = ordens.buscarOrdens(baseOrdens);

		try {

			for (int i = 0; i < ordem.size(); i++) {
				System.out.printf("Posição %d\n", i);
				System.out.printf("Ordem %s\n", ordem.get(i).getOrdem());
				System.out.printf("Canal %s\n", ordem.get(i).getCanal());
				System.out.printf("Ação %s\n", ordem.get(i).getAcao());
				System.out.printf("Passo %s\n", ordem.get(i).getPasso());
				System.out.printf("Status %s\n", ordem.get(i).getStatus());
				System.out.println("\n");
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e);
		}
	}
}