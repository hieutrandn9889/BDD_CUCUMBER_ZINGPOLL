package common;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class AbstractTest {

	/**
	 * open browser and navigate to url
	 * @param browser
	 * @throws Exception
	 */
	protected WebDriver openBrowser(String browser, String url) {
		Browser br = new Browser();
		WebDriver driver = br.launch(browser, url);
		if (driver.toString().toLowerCase().contains("chrome") 
				|| driver.toString().toLowerCase().contains("firefox") 
				|| driver.toString().toLowerCase().contains("internetexplorer")) {
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.focus();");
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	public void closeBrowser(WebDriver driver) {
		try {
			driver.quit();
			System.gc();
			if (driver.toString().toLowerCase().contains("chrome")) {
				String cmd = "taskkill /IM chromedriver.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
			if (driver.toString().toLowerCase().contains("internetexplorer")) {
				String cmd = "taskkill /IM IEDriverServer.exe /F";
				Process process = Runtime.getRuntime().exec(cmd);
				process.waitFor();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String randomString() {
		Random rand = new Random();
		int number = rand.nextInt(9000) + 1;
		String numberString = Integer.toString(number);
		return numberString;
	}
	
	public String randomFourNumbers() {
		Random rand = new Random();
		int number = 0;
		do {
			number = rand.nextInt(9000) + 1;
		} while (number < 1000);
		String numberString = Integer.toString(number);
		return numberString;
	}

	protected WebDriver driver;
	protected AutomationControl control = new AutomationControl();
}
