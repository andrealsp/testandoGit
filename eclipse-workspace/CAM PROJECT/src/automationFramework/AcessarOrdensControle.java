package automationFramework;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcessarOrdensControle {

	private WebDriver driver = new FirefoxDriver();
	private WebDriverWait wait = new WebDriverWait(driver, 1000000000);

	public void AcessarOrdens() {
		try {
			WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
			driver.switchTo().frame("contents");
			driver.findElement(By.cssSelector("a[href='http://localhost:9000/servlet/control/FetchPage?pageType=OrderRequestPage']")).click();
			//driver.findElement(By.id("Layer2")).click();
			//driver.findElement(By.linkText("/servlet/control/FetchPage?pageType=OrderRequestPage")).click();
			driver.switchTo().defaultContent();
		} finally {
			driver.quit();
		}
	}

}
