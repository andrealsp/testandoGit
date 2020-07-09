package br.com.cam.automacao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Login login = new Login();
		ConnectCAM connect = new ConnectCAM();
		GerenciarOrdem acessarOrdens = new GerenciarOrdem();

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver cam = new ChromeDriver();

		login.getCredential();

		connect.logar(login, cam);
		acessarOrdens.acessar(cam);
		//acessarOrdens.searchOrders(cam);
		acessarOrdens.acessarPos(cam);
		acessarOrdens.acessarLinha("11979959494", cam);

	}

}
