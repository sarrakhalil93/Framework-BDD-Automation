package com.selenium.e2eTests.authentication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

	/* locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String MESSAGE_WELCOME = "welcome";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = MESSAGE_WELCOME)
	public static WebElement messageWelcome;

	/* Methods */
	public void fillUsername(String name) {
		userName.sendKeys(name);
	}

	public void fillPassword(String password2) {
		password.sendKeys(password2);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();
	}

}
