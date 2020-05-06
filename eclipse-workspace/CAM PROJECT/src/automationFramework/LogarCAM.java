package automationFramework;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogarCAM {

	private WebDriver driver = new FirefoxDriver();
	private WebDriverWait wait = new WebDriverWait(driver, 1000000000);

	public void logarCAM() {
		try {

			driver.get("http://localhost:9000/login.jsp");
			
			driver.switchTo().frame("main");

			WebElement usuario = driver.findElement(By.name("userId"));
			usuario.sendKeys("80658893");

			WebElement senha = driver.findElement(By.name("passwd"));
			senha.sendKeys("Als@1829");

			WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
			submit.click();

			driver.switchTo().defaultContent();

			WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));

			System.out.println(firstResult);
		} finally {
			driver.quit();
		}
	}
}
