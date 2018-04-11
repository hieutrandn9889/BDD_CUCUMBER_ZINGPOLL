package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver launch(String browser, String url) {
		try {

			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", Constants.IE_PATH);
				driver = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
				driver = new ChromeDriver();
			}
			driver.get(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	private WebDriver driver;
}
