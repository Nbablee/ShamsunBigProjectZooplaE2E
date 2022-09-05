package com.zoopla.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.basepage.ZooplaBase;

//import zoopla.uk.generic.WaitHelper;

public class LoginElementsPage extends ZooplaBase {
	
	
	public LoginElementsPage() {
		PageFactory.initElements(driver,this);
		
	}

@FindBy(xpath="//*[@id='__next']/div/header/div/div/nav/div[3]/div[2]/ul/li[3]/a")
			
 @CacheLookup
 private WebElement clickOnSignButton;

public WebElement getClickOnSignButton() {
	
	return clickOnSignButton;
}
	
@FindBy(id="email")

@CacheLookup
private static WebElement userName;

public static WebElement getEnterUserName() {
	
	return userName;
}	
@FindBy(id="password")

@CacheLookup
private static WebElement enterPwd;

public static WebElement getEnterPwd() {
	
	return enterPwd;
}
@FindBy(xpath="(//*[contains(@class,'klmMZv ')])[4]")

@CacheLookup
private WebElement signBTN;

public WebElement getSignBTN() {
	
	return signBTN;
}
@FindBy(xpath="//*[text()='Welcome back to your account']")
@CacheLookup
private WebElement verifyText;

public WebElement getVerifyText() {
		return verifyText;
}




public static void getUserNameAndPwd(String uName,String pwd) {
	//WaitHelper.waitUntilElementToBeClickable(getEnterUserName());
	getEnterUserName().sendKeys(uName);
	//WaitHelper.waitUntilElementToBeClickable(getEnterPwd());
	getEnterPwd().sendKeys(pwd);
}
	
	//LoginElementsPage obj= new LoginElementsPage();
	//getEnterUserName().sendKeys(uName);
	//getEnterPwd().sendKeys(pwd);
}



