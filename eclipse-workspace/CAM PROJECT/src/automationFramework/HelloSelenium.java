package automationFramework;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloSelenium {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 1000000000);
		/*
		 * @WebServlet("/servletName") protected final void doPost(HttpServletRequest
		 * request, HttpServletResponse response) throws IOException, ServletException {
		 * System.setProperty("webdriver.gecko.driver","path//geckodriver.exe");
		 * System.out.println("In Servlet"); driver.get("https://www.google.com");
		 * response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		 * response.getOutputStream().write("Done".getBytes("UTF-8"));
		 * response.getOutputStream().flush(); response.getOutputStream().close(); }
		 */
	}
}