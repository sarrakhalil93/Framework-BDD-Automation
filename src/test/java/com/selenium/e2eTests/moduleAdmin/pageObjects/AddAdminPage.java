package com.selenium.e2eTests.moduleAdmin.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.e2eTests.utils.CommonMethods;

public class AddAdminPage {

	public CommonMethods commonMethods = new CommonMethods();
	
	/* locators */
	final static String MENU_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String ADD_BUTTON_ID = "btnAdd";
	final static String EMPLOYE_NAME_ID = "systemUser_employeeName_empName";
	final static String EMPLOYE_USERNAME_ID = "systemUser_userName";
	final static String EMPLOYE_PASSWORD_ID = "systemUser_password";
	final static String EMPLOYE_CONFIRM_PASSWORD_ID = "systemUser_confirmPassword";
	final static String SAVE_BUTTON_ID = "btnSave";

	/* @FindBy */
	@FindBy(how = How.ID, using = MENU_ADMIN_ID)
	public static WebElement menuAdmin;
	@FindBy(how = How.ID, using = ADD_BUTTON_ID)
	public static WebElement btnAdd;
	@FindBy(how = How.ID, using = EMPLOYE_NAME_ID)
	public static WebElement employeName;
	@FindBy(how = How.ID, using = EMPLOYE_USERNAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = EMPLOYE_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = EMPLOYE_CONFIRM_PASSWORD_ID)
	public static WebElement confirmPassword;
	@FindBy(how = How.ID, using = SAVE_BUTTON_ID)
	public static WebElement btnSave;
	/* Methods */

	public void clickOnModuleAdmin() {
		menuAdmin.click();
	}

	public void clickOnAddButton() {
		btnAdd.click();
	}

	public void clickOnSaveButton() {
		btnSave.click();
	}

	public void fillName(String name) throws InterruptedException {
		//employeName.sendKeys(name);
		commonMethods.autocomplete1(employeName, name);
	}

	public void fillUsername(String username) {
		userName.sendKeys(username);
	}

	public void fillPassword(String mdp) {
		password.sendKeys(mdp);
	}

	public void confirmPassword(String confirmMdp) {
		confirmPassword.sendKeys(confirmMdp);
	}

//	public void remplirFormulaireUserSys(String name, String username, String mdp, String confirmMdp) {
//		btnAdd.click();
//		employeName.sendKeys(name);
//		userName.sendKeys(username);
//		password.sendKeys(mdp);
//		confirmPassword.sendKeys(confirmMdp);
//		btnSave.click();
//	}

}
