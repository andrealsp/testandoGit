package br.com.cam.bean;

// Classe Popula um grupo de dados extraídos pela conexão com a Base do NCAM
public class GrupoBean {
	private String cam_ordem;
	private String linha;
	private String canal;
	private String acao;
	private String status_ordem;
	private String processamento;
	private String status_transacao;
	private String acao_transacao;
	private String erro;
	private String ds_erro;
	private String data;
	private String service_order;

	// Método construtor com dados necessários extraídos da base NCAM
	public GrupoBean(String cam_order, String linha, String canal, String acao, String status_ordem,
			String processamento, String data, String service_order) {
		// TODO Auto-generated constructor stub
		super();
		this.cam_ordem = cam_order;
		this.linha = linha;
		this.canal = canal;
		this.acao = acao;
		this.status_ordem = status_ordem;
		this.processamento = processamento;
		this.data = data;
		this.service_order = service_order;
	}

	public String getCam_ordem() {
		return cam_ordem;
	}

	public void setCam_ordem(String cam_ordem) {
		this.cam_ordem = cam_ordem;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
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

	public String getStatus_ordem() {
		return status_ordem;
	}

	public void setStatus_ordem(String status_ordem) {
		this.status_ordem = status_ordem;
	}

	public String getProcessamento() {
		return processamento;
	}

	public void setProcessamento(String processamento) {
		this.processamento = processamento;
	}

	public String getStatus_transacao() {
		return status_transacao;
	}

	public void setStatus_transacao(String status_transacao) {
		this.status_transacao = status_transacao;
	}

	public String getAcao_transacao() {
		return acao_transacao;
	}

	public void setAcao_transacao(String acao_transacao) {
		this.acao_transacao = acao_transacao;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getDs_erro() {
		return ds_erro;
	}

	public void setDs_erro(String ds_erro) {
		this.ds_erro = ds_erro;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getService_order() {
		return service_order;
	}

	public void setService_order(String service_order) {
		this.service_order = service_order;
	}

}
