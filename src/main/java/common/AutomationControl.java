package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationControl {

	public WebElement findElement(WebDriver driver,String controlName) {
		WebElement element = null;
		element = driver.findElement(By.xpath(controlName));
		return element;
	}
	
	public WebElement findElement(WebDriver driver, String specialControl, String value) {
		WebElement element = null;
		String control = String.format(specialControl, value);
		element = driver.findElement(By.xpath(control));
		return element;
	}
	
	public List<WebElement> findElements(WebDriver driver,String controlName) {
		List<WebElement> lstElement = null;
		lstElement = driver.findElements(By.xpath(controlName));
		return lstElement;
	}
	
	public List<WebElement> findElements(WebDriver driver,String controlName,String value) {
		List<WebElement> lstElement = null;
		String control = String.format(controlName, value);
		lstElement = driver.findElements(By.xpath(control));
		return lstElement;
	}
	
	/**
	 * get by for element
	 * @param driver
	 * @param controlName
	 */
	public By getBy(WebDriver driver,String controlName) {
		By by = null;
		by = By.xpath(controlName);
		return by;
	}
	
	public By getBy(WebDriver driver, String specialControl, String value) {
		By by = null;
		String control = String.format(specialControl, value);
		by = By.xpath(control);
		return by;
	}
	
}
