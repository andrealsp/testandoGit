package br.com.cam.automacao;

// Classe para armazenar dados pertinentes de cada ordem para gerenciamento.
public class Ordem {

	private String ordem;
	private String passo;
	private String canal;
	private String status;
	private String acao;
	private String erro;

	public Ordem() {
		// Construtor Default
	}

	// Método construtor com dados necessários extraídos da base NCAM
	public Ordem(String ordem, String passo, String canal, String status, String acao, String erro) {
		this.ordem = ordem;
		this.passo = passo;
		this.canal = canal;
		this.status = status;
		this.acao = acao;
		this.erro = erro;
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

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

}
