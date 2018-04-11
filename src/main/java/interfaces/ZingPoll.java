package interfaces;

public class ZingPoll {
	public static String SIGN_IN_TITLE = "//*[@id='Loginform']";
	public static String SIGN_IN_POPUP = "//*[@id='Login']//div[@class='modal-content']";
	public static String ERROR_NAME_NOT_REGISTERED_MESSAGE = "//*[contains(text(),'Please enter your name.')]";
	public static String ERROR_NOT_REGISTERED_MESSAGE = "//*[@id='loginMessage' and contains(text(),'%s')]";
	public static String PASSWORD_INCORECT_ERROR_MESSAGE = "//*[@id='loginMessageFail' and contains(text(),'%s')]";
	public static String NAME_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String RE_PASSWORD_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String TC_INCORECT_ERROR_MESSAGE = "//*[contains(text(),'%s')]";
	public static String EMAIL_TEXTBOX = "//*[@id='loginEmail']";
	public static String PASSWORD_TEXTBOX = "//*[@id='loginPassword']";
	public static String LOGIN_BUTTON = "//*[@id='button-login']";
	public static String REGISTER_BUTTON = "//*[@id='reg-submit']";
	public static String NEW_USER_BUTTON = "//span[contains(.,'New user')]";
	public static String PROFILE_NAME_TITLE = "//div[@class='username' and contains(text(),'%s')]";
}
