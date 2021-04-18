package com.selenium.e2eTests.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;

	// Constructor
	public CommonMethods() {
		driver = Setup.driver;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void openApplication() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		;
	}

	public void autocomplete1(WebElement element, String value) throws InterruptedException {
		element.sendKeys(Keys.CONTROL, Keys.chord("a"));
		element.sendKeys(Keys.DELETE);
		element.sendKeys(value);
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
	}

	public void autocomplete(WebElement element, int index) {
		WebElement autoOptions = element;
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		int indexToSelect = index;
		if (indexToSelect <= optionsToSelect.size()) {
			optionsToSelect.get(indexToSelect).click();
		}
	}

	// Read from Json file
	public JSONObject JsonLocatorData(int i) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("./src/test/resources/test_data/ConfigFileLocators.json"));
			JSONArray array = (JSONArray) obj;
			JSONObject jsonObject = (JSONObject) array.get(i);

			return jsonObject;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void selectDropDownListByVisibleText(WebElement element, String text) {
		Select dropDownList = new Select(element);
		dropDownList.selectByVisibleText(text);
	}

	public void selectDropDownListByIndex(WebElement element, int index) {
		Select dropDownList = new Select(element);
		dropDownList.selectByIndex(index);
	}

	public void selectDropDownListByValue(WebElement element, String text) {
		Select dropDownList = new Select(element);
		dropDownList.selectByValue(text);
	}

	public Boolean isElementDisplayed(WebElement element) {
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}

	public Boolean isElementEnabled(WebElement element) {
		Boolean isElementDisplayed = element.isEnabled();
		return isElementDisplayed;
	}

	public Boolean isElementSelected(WebElement element) {
		Boolean isElementDisplayed = element.isSelected();
		return isElementDisplayed;
	}

	public boolean isElementPresent(String xpat_element) {
		int count = driver.findElements(By.xpath(xpat_element)).size();
		if (count == 0)
			return false;
		else
			return true;
	}

	public boolean isElementClickable(WebElement el, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String checkForColor(String color, String[] hexValue) {
		int hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3 = Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		return actualColor;
	}

	public boolean isAttributePresent(WebElement element, String attribute) {
		Boolean result = true;
		try {
			String value = element.getAttribute(attribute);
			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
