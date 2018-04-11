package page;

import org.openqa.selenium.WebDriver;

import common.Constants;
import interfaces.ZingPoll;

public class HomePage extends AbstractPage {

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void openZingPollPage() {
		openURL(driver, Constants.ZINGPOLL_URL);
	}

	public void clickSignInTitle() {
		waitForControl(driver, ZingPoll.SIGN_IN_TITLE, timeWait);
		click(driver, ZingPoll.SIGN_IN_TITLE);
	}

	public void isSignInPopupDisplay() {
		waitForControl(driver, ZingPoll.SIGN_IN_POPUP, timeWait);
		isControlDisplayed(driver, ZingPoll.SIGN_IN_POPUP);
	}
	
	public void isSignUpPopupDisplay() {
		waitForControl(driver, ZingPoll.SIGN_IN_POPUP, timeWait);
		isControlDisplayed(driver, ZingPoll.SIGN_IN_POPUP);
	}

	public void typeIntoEmail(String email) {
		waitForControl(driver, ZingPoll.EMAIL_TEXTBOX, timeWait);
		type(driver, ZingPoll.EMAIL_TEXTBOX, email);
		sleep(2);
	}

	public void typeIntoPassword(String password) {
		waitForControl(driver, ZingPoll.PASSWORD_TEXTBOX, timeWait);
		type(driver, ZingPoll.PASSWORD_TEXTBOX, password);
		sleep(2);
	}

	public void clickSignInButton() {
		waitForControl(driver, ZingPoll.LOGIN_BUTTON, timeWait);
		click(driver, ZingPoll.LOGIN_BUTTON);
	}
	
	public void clickRegisterButton() {
		waitForControl(driver, ZingPoll.REGISTER_BUTTON, timeWait);
		click(driver, ZingPoll.REGISTER_BUTTON);
	}
	
	public void clickNewUserButton() {
		waitForControl(driver, ZingPoll.NEW_USER_BUTTON, timeWait);
		click(driver, ZingPoll.NEW_USER_BUTTON);
	}
	
	public void isNameNotRegisteredErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.ERROR_NAME_NOT_REGISTERED_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.ERROR_NAME_NOT_REGISTERED_MESSAGE, errorMsg);
	}
	
	public void isEmailNotRegisteredErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.ERROR_NOT_REGISTERED_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.ERROR_NOT_REGISTERED_MESSAGE, errorMsg);
	}

	public void isPasswordIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg);
	}
	
	public void isNameIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.NAME_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.NAME_INCORECT_ERROR_MESSAGE, errorMsg);
	}
	
	public void isTCIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.TC_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.TC_INCORECT_ERROR_MESSAGE, errorMsg);
	}
	
	public void isRePasswordIncorrectErrorMessageDisplay(String errorMsg) {
		waitForControl(driver, ZingPoll.RE_PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg, timeWait);
		isControlDisplayed(driver, ZingPoll.RE_PASSWORD_INCORECT_ERROR_MESSAGE, errorMsg);
	}

	public void isProfileNameDisplay(String profileName) {
		waitForControl(driver, ZingPoll.PROFILE_NAME_TITLE, profileName, timeWait);
		isControlDisplayed(driver, ZingPoll.PROFILE_NAME_TITLE, profileName);
	}

	private WebDriver driver;
}
