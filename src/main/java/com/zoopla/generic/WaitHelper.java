package com.zoopla.generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.basepage.ZooplaBase;

public class WaitHelper extends ZooplaBase {

	
	public static void waitUntilElementToBePresent(WebElement ele) {
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
				
	}
	public static void waitVisibilityOfAllElements(List<WebElement> element) {
		WebDriverWait waitForFormLabel = new WebDriverWait(driver, 30);
		waitForFormLabel.until(ExpectedConditions.visibilityOfAllElements(element));
	}
}
