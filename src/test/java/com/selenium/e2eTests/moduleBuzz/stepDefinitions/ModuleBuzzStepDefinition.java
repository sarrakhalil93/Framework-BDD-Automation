package com.selenium.e2eTests.moduleBuzz.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleBuzz.pageObjects.ModuleBuzzPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.When;

public class ModuleBuzzStepDefinition {

	public WebDriver driver;
	public ModuleBuzzPage moduleBuzzPage = new ModuleBuzzPage();

	// Constructor
	public ModuleBuzzStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, moduleBuzzPage);
	}

	@When("^Je clique sur le module Buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		moduleBuzzPage.clickOnModuleBuzz();
	}

	@When("^Je saisis un message dans le champ Update status \"([^\"]*)\"$")
	public void jeSaisisUnMessageDansLeChampUpdateStatus(String message) throws Throwable {
		moduleBuzzPage.fillMessageInUpdateStatus(message);
		Thread.sleep(3000);
	}
}
