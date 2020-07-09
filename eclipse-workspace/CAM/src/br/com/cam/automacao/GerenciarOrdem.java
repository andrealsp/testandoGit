package br.com.cam.automacao;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Classe Para acessar Canais onde est�o as ordens
public class GerenciarOrdem {

	public void acessar(WebDriver cam) {

		// Acessa bot�o Orders no CAM
		cam.getCurrentUrl();

		cam.switchTo().frame("contents");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(ByName.name("img1")));

		WebElement orders = cam.findElement(ByName.name("img1"));
		orders.click();

		cam.switchTo().defaultContent();

		// Clica no link Search services Orders no CAM
		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("body > table > tbody > tr:nth-child(4) > td:nth-child(1) > p > a:nth-child(1)")));

		WebElement searchOrders = cam.findElement(
				By.cssSelector("body > table > tbody > tr:nth-child(4) > td:nth-child(1) > p > a:nth-child(1)"));
		searchOrders.click();

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
	// A p�gina de pesquisa � semelhante em todos os Canais.
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

	// Encontra a ordem correspondente no CAM para ativ�-la
	public void ativarOrdem(List<Ordem> ordens, WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[7]/tbody/tr[2]/td[2]/a[3]/img")));

		int n = ordens.size();
		int i;

		try {
			// percorre toda lista de ordens da ultima a primeira
			for (i = 0; n > i; n--) {

				// System.out.println(ordens.get(i).getOrdem());

				if (ordens.get(i).getStatus().equals("Cancel")) {

					for (int j = 2; j <= 11; j++) {

						WebElement orderInformation = cam
								.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + j + "]/td[9]/p"));

						String ordem = orderInformation.getText();

						String[] splitOrder = ordem.split("_");

						String ordemCam = splitOrder[2];

						String[] st2 = splitOrder[1].split("-");

						String passo = st2[1];

						// System.out.println(ordens.get(i).getOrdem());

						if (ordens.get(i).getOrdem().equals(ordemCam)) {

							System.out.println(ordens.get(i).getOrdem());

							WebElement opcoes = cam
									.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + j + "]/td[2]/a[3]/img"));

							opcoes.click();

							cam.getCurrentUrl();

							cam.switchTo().frame("main");

						}

					}

				}

				if (ordens.get(i).getStatus().equals("Change") || ordens.get(i).getStatus().equals("Reinstate")) {

					for (int j = 2; j <= 11; j++) {

						WebElement orderInformation = cam
								.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + j + "]/td[9]/p"));

						String ordem = orderInformation.getText();

						String[] splitOrder = ordem.split("_");

						String ordemCam = splitOrder[2];

						String[] st2 = splitOrder[1].split("-");

						String passo = st2[1];

						if (ordens.get(i).getOrdem().equals(ordemCam))
							;

					}

				}

			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro " + e);
		}
	}

}
