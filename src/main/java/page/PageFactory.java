package page;

import org.openqa.selenium.WebDriver;

public class PageFactory {

	public static HomePage getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}

	
	
	
}
