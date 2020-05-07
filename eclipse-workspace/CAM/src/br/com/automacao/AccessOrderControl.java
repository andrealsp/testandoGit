package br.com.automacao;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessOrderControl {
	public void acessar() {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver cam = new ChromeDriver();

		// precisa ficar na mesma pagina pra dar certo.

		// 1) cam.get("http: // localhost:9000/servlet/control/Login");

		// 2) cam.navigate().to("http: // localhost:9000/servlet/control/Login");

		cam.getCurrentUrl();

		// cam.switchTo().frame("contents");

		if (cam.getCurrentUrl().contentEquals("http://localhost:9000/servlet/control/Login")) {
			cam.close();
			cam.get("https://www.google.com");
		}

		// WebElement orders =
		// cam.findElement(ByXPath.xpath("//*[@id='Layer2']/html/body/div[2]"));
		// orders.sendKeys();

		cam.switchTo().defaultContent();

	}
}
