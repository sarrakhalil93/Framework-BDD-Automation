package com.selenium.e2eTests.moduleAdmin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.moduleAdmin.pageObjects.AddAdminPage;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class AddAdminStepDefinition {
	
	public WebDriver driver;
	public AddAdminPage addAdminPage = new AddAdminPage();
	
	public AddAdminStepDefinition() {
		driver = Setup.driver;
		PageFactory.initElements(driver, addAdminPage);
	}
	
	
	@When("^Je clique sur le module Admin$")
	public void jeCliqueSurLeModuleAdmin() throws Throwable {
		addAdminPage.clickOnModuleAdmin();
	}

	@And("^Je clique sur le bouton Add$")
	public void jeCliqueSurLeBoutonAdd() throws Throwable {
		addAdminPage.clickOnAddButton();
	}

	@When("^Je saisis le champ Employee Name \"([^\"]*)\"$")
	public void jeSaisisLeChampEmployeeName(String name) throws Throwable {
		addAdminPage.fillName(name);
	}

	@When("^Je saisis le champ Username \"([^\"]*)\"$")
	public void jeSaisisLeChampUsername(String username) throws Throwable {
		addAdminPage.fillUsername(username);
	}

	@When("^Je saisis le champ Password \"([^\"]*)\"$")
	public void jeSaisisLeChampPassword(String mdp) throws Throwable {
		Thread.sleep(2000);
		addAdminPage.fillPassword(mdp);
	}

	@When("^Je saisis le champ Confirm Password \"([^\"]*)\"$")
	public void jeSaisisLeChampConfirmPassword(String confirmMdp) throws Throwable {
		addAdminPage.confirmPassword(confirmMdp);
	}

	@When("^Je clique sur le bouton save$")
	public void jeCliqueSurLeBoutonSave() throws Throwable {
		Thread.sleep(2000);
		addAdminPage.clickOnSaveButton();
	}


}
