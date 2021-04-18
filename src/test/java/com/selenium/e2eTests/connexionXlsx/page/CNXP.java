package com.selenium.e2eTests.connexionXlsx.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.e2eTests.utils.ExcelUtils;

public class CNXP {
	
	/* locators */
	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;

	
	
	
	
	
	public static void signINxlsX() {
		String sUsername = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		userName.sendKeys(sUsername);
		password.sendKeys(sPassword);
		
	}

}
