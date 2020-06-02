package br.com.cam.automacao;

// Classe para armazenar dados pertinentes de cada ordem para gerenciamento.
public class Ordem {

	private String ordem;
	private String passo;
	private String canal;
	private String status;

	// M�todo construtor com dados necess�rios extra�dos da base NCAM
	public Ordem(String ordem, String passo, String canal, String status) {
		this.ordem = ordem;
		this.passo = passo;
		this.canal = canal;
		this.status = status;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getPasso() {
		return passo;
	}

	public void setPasso(String passo) {
		this.passo = passo;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
