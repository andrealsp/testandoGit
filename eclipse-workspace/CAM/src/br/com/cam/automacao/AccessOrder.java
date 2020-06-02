package br.com.cam.automacao;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


// Classe Para acessar Canais onde estão as ordens
public class AccessOrder {
	
	// Clica no botão Orders no CAM
	public void acessar(WebDriver cam) {

		cam.getCurrentUrl();

		cam.switchTo().frame("contents");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(ByName.name("img1")));

		WebElement orders = cam.findElement(ByName.name("img1"));
		orders.click();

		cam.switchTo().defaultContent();

	}

	// Acessa o link de Search services Orders no CAM
	public void searchOrders(WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("body > table > tbody > tr:nth-child(4) > td:nth-child(1) > p > a:nth-child(1)")));

		WebElement searchOrders = cam.findElement(
				By.cssSelector("body > table > tbody > tr:nth-child(4) > td:nth-child(1) > p > a:nth-child(1)"));
		searchOrders.click();

		cam.switchTo().defaultContent();

	}
	
	// Acessa Canal Controle
	public void acessarControle(WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[1]")));

		WebElement searchOrders = cam.findElement(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[1]"));
		searchOrders.click();

		WebElement submit = cam.findElement(By.cssSelector("input[type='button']"));
		submit.click();

		cam.switchTo().defaultContent();

	}
	
	// Acessa Canal PostPaid
	public void acessarPos(WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[4]")));

		WebElement searchOrders = cam.findElement(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[4]"));
		searchOrders.click();

		WebElement submit = cam.findElement(By.cssSelector("input[type='button']"));
		submit.click();

		cam.switchTo().defaultContent();

	}
	
	// Acessa Canal ServPack
	public void acessarServPack(WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[5]")));

		WebElement searchOrders = cam.findElement(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[5]"));
		searchOrders.click();

		WebElement submit = cam.findElement(By.cssSelector("input[type='button']"));
		submit.click();

		cam.switchTo().defaultContent();

	}
	
	// Acessa Canal HabRemota
	public void acessarHabRemota(WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[2]")));

		WebElement searchOrders = cam.findElement(By.xpath(
				"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[2]"));
		searchOrders.click();

		WebElement submit = cam.findElement(By.cssSelector("input[type='button']"));
		submit.click();

		cam.switchTo().defaultContent();

	}

	// Pesquisa linha no CAM.
	// A página de pesquisa é semelhante em todos os Canais.
	public void acessarLinha(String linha, WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions
				.elementToBeClickable(By.xpath("/html/body/div/form/table/tbody/tr[14]/td[1]/span/input")));

		WebElement inserirLinha = cam.findElement(By.xpath("/html/body/div/form/table/tbody/tr[14]/td[1]/span/input"));
		inserirLinha.sendKeys(linha);

		WebElement submit = cam.findElement(By.cssSelector("input[type='submit']"));
		submit.click();

		cam.switchTo().defaultContent();

	}

}
