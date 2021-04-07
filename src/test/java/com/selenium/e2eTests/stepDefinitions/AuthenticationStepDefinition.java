package com.selenium.e2eTests.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.e2eTests.pageObjects.AuthenticationPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDefinition {

	public WebDriver driver;
	public AuthenticationPage authenticationPage = new AuthenticationPage();
	public CommonMethods commonMethods = new CommonMethods();
	//Constructor
	public  AuthenticationStepDefinition() {
		driver =Setup.driver;
	}

	@Given("^J'ouvre l'application OrangeHRM$")
	public void jOuvreLApplicationOrangeHRM() throws Throwable {
    //driver.get("https://opensource-demo.orangehrmlive.com/");
		commonMethods.openApplication();
	}

	@When("^Je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String name) throws Throwable {
		PageFactory.initElements(driver, authenticationPage);
		authenticationPage.fillUsername(name);
	}

	@When("^Je saisis le mot de passe \"([^\"]*)\"$")
	public void jeSaisisLeMotDePasse(String password2) throws Throwable {
       authenticationPage.fillPassword(password2);
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
      authenticationPage.clickOnBtnLogin();
	}

	@Then("^Redirection vers la page Home de l'application OrangeHRM \"([^\"]*)\"$")
	public void redirectionVersLaPageHomeDeLApplicationOrangeHRM(String textMessage) throws Throwable {
		String adminUser = AuthenticationPage.messageWelcome.getText();
		Assert.assertEquals(textMessage, adminUser);
	}

}
