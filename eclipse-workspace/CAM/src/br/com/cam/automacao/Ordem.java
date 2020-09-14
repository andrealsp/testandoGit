package br.com.cam.automacao;

// Classe para armazenar dados pertinentes de cada ordem para gerenciamento.
public class Ordem {

	private String ordem;
	private String passo;
	private String canal;
	private String status;
	private String acao;

	public Ordem() {
		// Construtor Default
	}

	// Método construtor com dados necessários extraídos da base NCAM
	public Ordem(String ordem, String passo, String canal, String status, String acao) {
		this.ordem = ordem;
		this.passo = passo;
		this.canal = canal;
		this.status = status;
		this.acao = acao;
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

	@Override
	public String toString() {
		return "Ordem [ordem=" + ordem + ", passo=" + passo + ", canal=" + canal + ", status=" + status + ", acao="
				+ acao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acao == null) ? 0 : acao.hashCode());
		result = prime * result + ((canal == null) ? 0 : canal.hashCode());
		result = prime * result + ((ordem == null) ? 0 : ordem.hashCode());
		result = prime * result + ((passo == null) ? 0 : passo.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordem other = (Ordem) obj;
		if (acao == null) {
			if (other.acao != null)
				return false;
		} else if (!acao.equals(other.acao))
			return false;
		if (canal == null) {
			if (other.canal != null)
				return false;
		} else if (!canal.equals(other.canal))
			return false;
		if (ordem == null) {
			if (other.ordem != null)
				return false;
		} else if (!ordem.equals(other.ordem))
			return false;
		if (passo == null) {
			if (other.passo != null)
				return false;
		} else if (!passo.equals(other.passo))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
