package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginToLiveGuru99 {
	WebDriver driver;
	@Given("^I open MyAccount page$")
	public void i_open_MyAccount_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		 run chrome
		 System.setProperty("webdriver.chrome.driver",
		 "src/test/resources/chromedriver.exe");
		 
		 driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		driver.findElement(By.xpath("//div[@class='footer-container']//a[contains(.,'My Account')]")).click();
	}

	@When("^I input user (.+) and (.+)$")
	public void i_input_user_hieutrandn_gmail_com_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	}
}
