package com.selenium.e2eTests.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ModuleBuzzPage {

	/* locators */
	final static String MODULE_BUZZ_ID = "menu_buzz_viewBuzz";
	final static String UPDATE_STATUS_ID = "createPost_content";

	/* @FindBy */
	@FindBy(how = How.ID, using = MODULE_BUZZ_ID)
	public static WebElement moduleBuzz;
	@FindBy(how = How.ID, using = UPDATE_STATUS_ID)
	public static WebElement updateStatus;

	/* Methods */
	public void clickOnModuleBuzz() {
		moduleBuzz.click();
	}
	
	public void fillMessageInUpdateStatus(String message) {
		updateStatus.sendKeys(message);
	}

}
