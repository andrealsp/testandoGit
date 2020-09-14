package br.com.cam.automacao;

import java.util.List;

import br.com.cam.dao.GerenciarOrdemDAO;

// Classe Para acessar Canais onde est�o as ordens
public class GerenciarOrdem {

	public String iniciarGerenciamentoOrdem(List<Ordem> ordens, String linha) {
		// TODO Auto-generated method stub
		String chamarAPI = new String();

		int ultimaPosicao = ordens.size() - 1;

		GerenciarOrdemDAO go = new GerenciarOrdemDAO();

		// cen�rio 1 - Canal da Ultima ordem valida � diferente do Canal da ordem com
		// falha
		// Migra��o de p�s para controle ou controle para p�s
		if (ordens.get(ultimaPosicao).getCanal() != ordens.get(0).getCanal()
				&& !ordens.get(0).getCanal().equals("ServPack")) {

			boolean bol = go.gerenciarCAM(ordens.get(0), linha);

			if (bol == true) {
				
				System.out.println("Linha ativada pela ordem pendente. Efetuar Skip_step do passo "
						+ ordens.get(0).getPasso() + " para a ordem " + ordens.get(0).getOrdem());
				
				chamarAPI = "skip";
				
			} else {
				
				System.out.println("Ativa��o no CAM apresentou falha. Verificar erro no CAM.");
				
			}

			
		}

		// cen�rio 2 - Canal da Ultima ordem valida � igual do Canal da ordem com
		// falha
		// percorre orndes intermedi�rias (suspend ou servPack)
		else {

			boolean bol = go.gerenciarCAM(ordens.get(ultimaPosicao), linha);

			// valida se ultima posi��o foi ativada
			if (bol == true) {

				// confirma se ordens intermedi�rias s�o Suspend
				if (ordens.get(ultimaPosicao - 1).getAcao().equals("suspend")) {

					for (int i = ultimaPosicao - 1; i > 0; i--) {

						if (ordens.get(i).getAcao().equals("suspend")) {

							bol = go.gerenciarCAM(ordens.get(i), linha);

						}

					}

					chamarAPI = "soma";
					
				}

				// confirma se ordens intermedi�rias s�o ServPack
				else if (ordens.get(ultimaPosicao - 1).getAcao().equals("ServPack")) {

					for (int i = ultimaPosicao - 1; i > 0; i--) {

						if (ordens.get(i).getAcao().equals("ServPack")) {

							bol = go.gerenciarCAM(ordens.get(i), linha);

						}

					}

					chamarAPI = "soma";
				}
				
				else if(ordens.get(ultimaPosicao - 1).getCanal().equals(ordens.get(0).getCanal())) {
					
					chamarAPI = "skip";
					
				}


			} else {
				
				System.out.println("Ativa��o no CAM apresentou falha. Verificar erro no CAM.");
				
			}

		}

		return chamarAPI;
		
	}

}
