package br.com.cam.automacao;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.cam.bean.GrupoBean;
import br.com.cam.controller.GerenciarOrdemController;
import br.com.cam.dao.GerenciarOrdemDAO;

public class TestMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		GerenciarOrdem go = new GerenciarOrdem();
		GerenciarOrdemDAO goDAO = new GerenciarOrdemDAO();

		String linha = "11944962195";
		List<Ordem> ordens = goDAO.buscaBaseNCAM(linha);

		int indice1 = ordens.size();
		int indice2 = ordens.size() - 1;

		System.out.println(indice1);

		System.out.println(ordens.get(indice2).getCanal());
		System.out.println(ordens.get(0).getCanal());

		System.out.println(indice2);

		String st = go.iniciarGerenciamentoOrdem(ordens, linha);

		System.out.println("Use a ferramenta " + st);

	}
}