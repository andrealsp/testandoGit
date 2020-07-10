package br.com.cam.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.cam.automacao.Ordem;

// Classe Para acessar Canais onde estão as ordens
public class GerenciarOrdemController {

	// acessa página inicial e janela de lista do search orders
	public void acessar(WebDriver cam) {

		// Acessa botão Orders no CAM
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

	// Acessa Canal Controle
	public void acessarCanal(Ordem ordem, WebDriver cam) {
		// TODO Auto-generated method stub

		// Seleciona canal e o aciona
		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@id=\"form1\"]/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/p/input")));

		// Escolhe na lista a opção Controle
		if (ordem.getCanal().equals("Controle")) {

			WebElement searchOrders = cam.findElement(By.xpath(
					"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[1]"));

			searchOrders.click();

		}

		// Escolhe na lista a opção PostPaid
		if (ordem.getCanal().equals("PostPaid")) {

			WebElement searchOrders = cam.findElement(By.xpath(
					"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[4]"));

			searchOrders.click();

		}

		// Escolhe na lista a opção ServPack
		if (ordem.getCanal().equals("ServPack")) {

			WebElement searchOrders = cam.findElement(By.xpath(
					"/html/body/form/table/tbody/tr/td/table/tbody/tr/td/table[3]/tbody/tr[2]/td[1]/table/tbody/tr/td[1]/p/select/option[5]"));

			searchOrders.click();

		}

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

	// Acessa Transação da Ordem (Atividades da Ordem). usado só em servPack
	public boolean acessarTransacaoOrdem(Ordem ordem, WebDriver cam) {
		// TODO Auto-generated method stub
		boolean bol = false;

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[5]/tbody/tr/td[2]/button/img")));

		WebElement ordemCAM;

		String passoOrdem = ordem.getPasso() + "_" + ordem.getOrdem();

		for (int i = 2; i <= 11; i++) {

			ordemCAM = cam.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + i + "]/td[9]/p"));

			String st = ordemCAM.getText();

			if (st.contains(passoOrdem)) {

				WebElement transacaoOrdem = cam
						.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + i + "]/td[2]/a[2]/img"));

				transacaoOrdem.click();

				cam.getCurrentUrl();

				new WebDriverWait(cam, 2).until(ExpectedConditions
						.elementToBeClickable(By.xpath("/html/body/table[10]/tbody/tr[1]/td[1]/input")));

				WebElement checkbox = cam.findElement(By.xpath("/html/body/table[10]/tbody/tr[1]/td[1]/input"));
				checkbox.click();

				WebElement reenviarAtividades = cam
						.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/button[2]"));
				reenviarAtividades.click();

				cam.switchTo().alert().accept();

				// botão de refresh
				cam.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/button"));

				cam.close();

				bol = true;
			}

			bol = false;
		}

		return bol;

	}

	// Acessar Order Actions (Ações da Ordem: Activate e Suspend)
	// não havia necessidae para o Reinstate
	public boolean acessarOrderAction(Ordem ordem, WebDriver cam) {
		// TODO Auto-generated method stub
		boolean bol = false;

		GerenciarOrdemController goc = new GerenciarOrdemController();

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(
				ExpectedConditions.elementToBeClickable(By.xpath("/html/body/table[5]/tbody/tr/td[2]/button/img")));

		WebElement ordemCAM;

		String passoOrdem = ordem.getPasso() + "_" + ordem.getOrdem();

		for (int i = 2; i <= 11; i++) {

			ordemCAM = cam.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + i + "]/td[9]/p"));

			String st = ordemCAM.getText();

			if (st.contains(passoOrdem)) {

				WebElement orderAction = cam
						.findElement(By.xpath("/html/body/table[7]/tbody/tr[" + i + "]/td[2]/a[3]/img"));

				orderAction.click();

				cam.getCurrentUrl();

				new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(
						By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[3]/p/input[6]")));

				if (ordem.getAcao().equals("activate") || ordem.getAcao().equals("change")
						|| ordem.getAcao().equals("reinstate")) {

					WebElement orderActionList = cam.findElement(
							By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/p/select/option[1]"));

					orderActionList.click();

					WebElement submit = cam.findElement(
							By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[3]/p/input[6]"));

					submit.click();

					cam.switchTo().defaultContent();

					goc.acessarOrderEntry(ordem, cam);

					new WebDriverWait(cam, 2).until(ExpectedConditions
							.elementToBeClickable(By.xpath("/html/body/table[5]/tbody/tr/td[2]/button")));

					if (cam.findElement(By.xpath("/html/body/table[7]/tbody/tr[2]/td[6]/p/font")).getText()
							.equals("Successful")) {

						bol = true;

					} else {
						bol = false;
					}

					cam.close();
				}
				if (ordem.getAcao().equals("suspend")) {

					WebElement orderActionList = cam.findElement(
							By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/p/select/option[4]"));

					orderActionList.click();

					WebElement submit = cam.findElement(
							By.xpath("/html/body/table[1]/tbody/tr[3]/td/table/tbody/tr[2]/td[3]/p/input[6]"));

					submit.click();

					cam.switchTo().defaultContent();

					goc.acessarOrderEntry(ordem, cam);

					new WebDriverWait(cam, 2).until(ExpectedConditions
							.elementToBeClickable(By.xpath("/html/body/table[5]/tbody/tr/td[2]/button")));

					if (cam.findElement(By.xpath("/html/body/table[7]/tbody/tr[2]/td[6]/p/font")).getText()
							.equals("Successful")) {

						bol = true;

					} else {
						bol = false;
					}

					cam.close();

					bol = true;
				}

				else {
					System.out.println("Ação de ordem não mapeada para tratativa.");

					bol = false;
				}

			}

		}

		return bol;

	}

	// Clica no botao OK de OrderEntry no CAM
	private void acessarOrderEntry(Ordem ordem, WebDriver cam) {
		// TODO Auto-generated method stub

		cam.getCurrentUrl();

		cam.switchTo().frame("main");

		new WebDriverWait(cam, 2).until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/table/tbody/tr[4]/td/table/tbody/tr[26]/td/table/tbody/tr/td[1]/input")));

		WebElement botaoOK = cam.findElement(
				By.xpath("/html/body/form/table/tbody/tr[4]/td/table/tbody/tr[26]/td/table/tbody/tr/td[1]/input"));
		botaoOK.click();

		cam.switchTo().defaultContent();

		cam.navigate().back();
		cam.navigate().back();
		cam.navigate().back();

	}

}
