package com.zoopla.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zoopla.basepage.ZooplaBase;

public class CommonUtility extends ZooplaBase{

	//Action Click
	public static void getActionClick(WebElement elm) {
		Actions obj = new Actions(driver);
		obj.click(null).build().perform();
	}
	
	public static Actions getAction1() {
		Actions action = new Actions(driver);
		return action;
	}
	
	public static boolean getVerifyTheResult1(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
		if (Expected.equals(Actual)) {
			System.out.println("Expected And Actual are equal");
		}else {
			System.out.println("Expected And Actual are not equal");
		}
		return true;
	}
	//JS Click
	public static void getJSClick(WebElement elm) {
		((JavascriptExecutor)driver).executeScript("arguments[0].c;ick();",elm);
	}
	public static Actions getAction() {
		Actions action = new Actions(driver);
		return action;
	}
	
	public static void getVerifyTheResult(String Expected, String Actual) {
		Assert.assertEquals(Expected, Actual);
		
	
	
	
	//public static boolean getVerifyTheResult(String Expected, String Actual) {
		//Assert.assertEquals(Expected, Actual);
		if (Expected.equals(Actual)) {
			System.out.println("Expected And Actual are equal");
		}else {
			System.out.println("Expected And Actual dose not equal");
		}
		//return true;
	}
}
