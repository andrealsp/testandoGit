package br.com.cam.automacao;

import java.util.List;

import br.com.cam.bean.GrupoBean;
import br.com.cam.dao.GerenciarOrdemDAO;

public class TestMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		GerenciarOrdemDAO ordens = new GerenciarOrdemDAO();
		String linha = "55999232154";
		List<GrupoBean> baseOrdens = ordens.buscaBaseNCAM(linha);

		List<Ordem> ordem = ordens.buscarOrdens(baseOrdens);

		// int i;
		// int n = ordem.size();

		// try {

		// for (i = 0; i < n; i++) {
		// System.out.printf("Posição %d\n", i);
		// System.out.printf("Ordem %s\n", ordem.get(i).getOrdem());
		// System.out.printf("Passo %s\n", ordem.get(i).getPasso());
		// System.out.printf("Canal %s\n", ordem.get(i).getCanal());
		// System.out.printf("Status %s\n", ordem.get(i).getStatus());
		// System.out.println("\n");
		// }
		// } catch (Exception e) {
		// System.out.println("Ocorreu um erro " + e);
	}
}
