package com.selenium.e2eTests.moduleMyInfo.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ModuleMyInfoPage {
	
	/* locators */
	final static String MODULE_MYINFO_ID = "menu_pim_viewMyDetails";
	final static String EDIT_BUTTON_ID = "btnSave";
	final static String MIDDLE_NAME_ID = "personal_txtEmpMiddleName";
	final static String EDIT_BLOOD_BUTTON_ID = "btnEditCustom";
	final static String SELECT_NAME = "custom1";
	final static String ADD_BTN_ID = "btnAddAttachment";
	final static String CHOOSE_FILE_BTN_ID = "ufile";
	final static String UPLOAD_BTN_ID = "btnSaveAttachment";
	/* @FindBy */
	@FindBy(how = How.ID, using = MODULE_MYINFO_ID )
	public static WebElement moduleMyInfo;
	@FindBy(how = How.ID, using = EDIT_BUTTON_ID )
	public static WebElement btnEdit;
	@FindBy(how = How.ID, using = MIDDLE_NAME_ID )
	public static WebElement middleName;
	@FindBy(how = How.ID, using = EDIT_BLOOD_BUTTON_ID )
	public static WebElement btnEditBlood ;
	@FindBy(how = How.NAME, using = SELECT_NAME )
	public static WebElement selectName ;
	@FindBy(how = How.ID, using = ADD_BTN_ID )
	public static WebElement btnAddFile ;
	@FindBy(how = How.ID, using = CHOOSE_FILE_BTN_ID )
	public static WebElement btnChooseFile ;
	@FindBy(how = How.ID, using = UPLOAD_BTN_ID)
	public static WebElement uploadFile ;
	
	public void clickOnModuleMyInfo() {
		moduleMyInfo.click();
	}
	
	public void clickOnSaveButton() {
		btnEdit.click();
	}
	public void fillMiddleName(String midName) {
		middleName.sendKeys(midName);
	}

	public void clickOnEditBloodButton() {
		btnEditBlood.click();
	}
	
	public void select(String bloodType) {
		Select se = new Select(selectName);
		//se.selectByVisibleText(bloodType);
		se.selectByIndex(0);
	}

	public void clickOnAddFile() {
		btnAddFile.click();
	}
	public void clickOnChooseFile(String path) {
		btnChooseFile.sendKeys(path);
	}
	public void uploadFile() {
		uploadFile.click();
	}
	/*
	public void robotTest(String imagePath) {
		StringSelection stringSelection = new StringSelection(imagePath);
		// Donner la main sur le clavier
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);

		Robot robot = null;

		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);

		
	}*/

}
