package com.selenium.e2eTests.moduleMyInfo.stepDefinitions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleMyInfo.pageObjects.ModuleMyInfoPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class ModuleMyInfoStepDefinition {
	
	public WebDriver driver;
	public ModuleMyInfoPage moduleMyInfoPage = new ModuleMyInfoPage();
	public static CommonMethods commonMethods = new CommonMethods();
	
	public  ModuleMyInfoStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, moduleMyInfoPage);
	}

	
	@When("^Je clique sur le module MyInfo$")
	public void jeCliqueSurLeModuleMyInfo() throws Throwable {
		moduleMyInfoPage.clickOnModuleMyInfo();
	}

	@When("^Je clique sur le bouton Edit$")
	public void jeCliqueSurLeBoutonEdit() throws Throwable {
		moduleMyInfoPage.clickOnSaveButton();
	}

	@When("^Je saisis le champ middle name \"([^\"]*)\"$")
	public void jeSaisisLeChampMiddleName(String miName) throws Throwable {
		moduleMyInfoPage.fillMiddleName(miName);
	}
	@When("^Je clique sur le bouton saveEdition$")
	public void jeCliqueSurLeBoutonSaveEdition() throws Throwable {
		moduleMyInfoPage.clickOnSaveButton();
	}
	
	
	@When("^Je clique sur le bouton EditBlood$")
	public void jeCliqueSurLeBoutonEditBlood() throws Throwable {
		moduleMyInfoPage.clickOnEditBloodButton();
	}

	@When("^Je sélectionne le champ blood type \"([^\"]*)\"$")
	public void jeSélectionneLeChampBloodType(String bloodType) throws Throwable {
		moduleMyInfoPage.select(bloodType);
		//commonMethods.selectDropDownListByVisibleText(ModuleMyInfoPage.selectName, bloodType);
	}

	@When("^Je clique sur le bouton saveBlood Type$")
	public void jeCliqueSurLeBoutonSaveBloodType() throws Throwable {
		moduleMyInfoPage.clickOnEditBloodButton();
	}
	
	@When("^Je clique sur le bouton AddFile$")
	public void jeCliqueSurLeBoutonAddFile() throws Throwable {
		moduleMyInfoPage.clickOnAddFile();
	}

	@When("^Je clique sur le bouton  ChoisirFile via$")
	public void jeCliqueSurLeBoutonChoisirFile() throws Throwable {
		//moduleMyInfoPage.clickOnChooseFile();
		//moduleMyInfoPage.clickOnChooseFile(path);
		
		// TODO with json file
		JSONObject jsonLocator = commonMethods.JsonLocatorData(0);
		String image = (String) jsonLocator.get("pic");
		String path_pic = new File(image).getAbsolutePath();
		StringSelection ss = new StringSelection(path_pic);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/*@When("^J'uploade le fichier via \"([^\"]*)\"$")
	public void jUploadeLeFichierVia(String filePath) throws Throwable {
		moduleMyInfoPage.robotTest(filePath);
	}
*/
	@When("^Je clique sur le bouton upload$")
	public void jeCliqueSurLeBoutonUpload() throws Throwable {
		moduleMyInfoPage.uploadFile();
	}

}
