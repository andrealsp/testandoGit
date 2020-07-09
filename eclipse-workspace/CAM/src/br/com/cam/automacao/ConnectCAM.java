package br.com.cam.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// classe para conectar no CAM
public class ConnectCAM {

	// Método realiza conexão no CAM
	public void logar(Login login, WebDriver cam) {

		cam.get("http://localhost:9000/login.jsp");

		cam.switchTo().frame("main");

		WebElement l = cam.findElement(By.name("userId"));
		l.sendKeys(login.getLogin());

		WebElement s = cam.findElement(By.name("passwd"));
		s.sendKeys(login.getSenha());

		WebElement submit = cam.findElement(By.cssSelector("input[type='submit']"));
		submit.click();

		cam.switchTo().defaultContent();

	}
}