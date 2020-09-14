package br.com.cam.automacao;

import java.util.List;

import br.com.cam.dao.GerenciarOrdemDAO;

// Classe Para acessar Canais onde estão as ordens
public class GerenciarOrdem {

	public String iniciarGerenciamentoOrdem(List<Ordem> ordens, String linha) {
		// TODO Auto-generated method stub
		String chamarAPI = new String();

		int ultimaPosicao = ordens.size() - 1;

		GerenciarOrdemDAO go = new GerenciarOrdemDAO();

		// cenário 1 - Canal da Ultima ordem valida é diferente do Canal da ordem com
		// falha
		// Migração de pós para controle ou controle para pós
		if (ordens.get(ultimaPosicao).getCanal() != ordens.get(0).getCanal()
				&& !ordens.get(0).getCanal().equals("ServPack")) {

			boolean bol = go.gerenciarCAM(ordens.get(0), linha);

			if (bol == true) {
				
				System.out.println("Linha ativada pela ordem pendente. Efetuar Skip_step do passo "
						+ ordens.get(0).getPasso() + " para a ordem " + ordens.get(0).getOrdem());
				
				chamarAPI = "skip";
				
			} else {
				
				System.out.println("Ativação no CAM apresentou falha. Verificar erro no CAM.");
				
			}

			
		}

		// cenário 2 - Canal da Ultima ordem valida é igual do Canal da ordem com
		// falha
		// percorre orndes intermediárias (suspend ou servPack)
		else {

			boolean bol = go.gerenciarCAM(ordens.get(ultimaPosicao), linha);

			// valida se ultima posição foi ativada
			if (bol == true) {

				// confirma se ordens intermediárias são Suspend
				if (ordens.get(ultimaPosicao - 1).getAcao().equals("suspend")) {

					for (int i = ultimaPosicao - 1; i > 0; i--) {

						if (ordens.get(i).getAcao().equals("suspend")) {

							bol = go.gerenciarCAM(ordens.get(i), linha);

						}

					}

					chamarAPI = "soma";
					
				}

				// confirma se ordens intermediárias são ServPack
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
				
				System.out.println("Ativação no CAM apresentou falha. Verificar erro no CAM.");
				
			}

		}

		return chamarAPI;
		
	}

}
