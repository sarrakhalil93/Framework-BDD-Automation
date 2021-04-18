package com.selenium.e2eTests.connexionXlsx.stepDef;

import org.openqa.selenium.WebDriver;

import com.selenium.e2eTests.authentication.pageObjects.AuthenticationPage;
import com.selenium.e2eTests.utils.CommonMethods;
import com.selenium.e2eTests.utils.Constant;
import com.selenium.e2eTests.utils.ExcelUtils;
import com.selenium.e2eTests.utils.Setup;

public class CNXSD {

	public WebDriver driver;
	public CNXP cNXP = new CNXP();
	public CommonMethods commonMethods = new CommonMethods();

	// Constructor
	public CNXP() {
		driver = Setup.driver;
	}
	
	@When("^I sign in from XLSX$")
	public void iSignInFromXLSX(String name) throws Throwable {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData);
		cNXP.signINxlsX();
	}

}
