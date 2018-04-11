package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.AbstractTest;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import page.HomePage;
import page.PageFactory;

@RunWith(Cucumber.class)
public class RegisterPageSteps extends AbstractTest {
	WebDriver driver;
	private HomePage homePage;
	
	@Given("^I am on ZingPoll website \"(.*?)\"$")
	public void i_am_on_ZingPoll_website(String browser){
	    // Write code here that turns the phrase above into concrete actions
		driver = openBrowser(browser, "https://www.zingpoll.com/");
		homePage = PageFactory.getHomePage(driver);
	}

	@Given("^I click the SignIn button$")
	public void i_click_the_SignIn_button(){
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickSignInTitle();
	}

	@Then("^The SignIn form should be shown$")
	public void the_SignIn_form_should_be_shown(){
	    // Write code here that turns the phrase above into concrete actions
		homePage.isSignInPopupDisplay();
	}

	@Then("^Choose task new user radio button$")
	public void choose_task_new_user_radio_button(){
	    // Write code here that turns the phrase above into concrete actions
		homePage.clickNewUserButton();
	}

	@Then("^The SignUp form should be shown$")
	public void the_SignUp_form_should_be_shown(){
	    // Write code here that turns the phrase above into concrete actions
	    homePage.isSignUpPopupDisplay();
	}

	@When("^I click Register button$")
	public void i_click_Register_button(){
	    // Write code here that turns the phrase above into concrete actions
	    homePage.clickRegisterButton();
	}

	@Then("^I verify the failure message \"(.*?)\"$")
	public void i_verify_the_failure_message(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		homePage.isNameNotRegisteredErrorMessageDisplay("Please enter your name.");
		homePage.isEmailNotRegisteredErrorMessageDisplay("Please enter your email.");
		homePage.isPasswordIncorrectErrorMessageDisplay("Please enter your password");
		homePage.isNameIncorrectErrorMessageDisplay("Please enter your name.");
		homePage.isRePasswordIncorrectErrorMessageDisplay("The re-type password is required and cannot be empty.");
		homePage.isTCIncorrectErrorMessageDisplay("Please agree with the term!");
	}
}
