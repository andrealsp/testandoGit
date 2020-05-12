package br.com.cam.automacao;

public class Login {
	private String login;
	private String senha;

	public void getCredential() {

		//login = JOptionPane.showInputDialog("Login:");
		//senha = JOptionPane.showInputDialog("Senha:");
		
		login = "80658893";
		senha = "Als@1829";

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
