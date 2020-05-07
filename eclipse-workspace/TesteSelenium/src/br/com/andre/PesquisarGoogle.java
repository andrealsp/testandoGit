package br.com.andre;

import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesquisarGoogle {

	public void pesquisar(String pesquisa) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chrome\\chromedriver.exe");
		WebDriver almeidinha = new ChromeDriver();

		almeidinha.get("https://www.google.com");

		WebElement p = almeidinha.findElement(ByName.name("q"));
		p.sendKeys(pesquisa);

		WebElement submit = almeidinha.findElement(ByXPath.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]"));
		submit.click();

		// almeidinha.close();
	}
}