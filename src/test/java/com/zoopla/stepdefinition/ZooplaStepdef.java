package com.zoopla.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.basepage.ZooplaBase;
import com.zoopla.elementspage.LoginElementsPage;
import com.zoopla.generic.CommonUtility;
import com.zoopla.generic.WaitHelper;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class ZooplaStepdef extends ZooplaBase {
	LoginElementsPage pf;
	
	
	
	@Given("User able to open a any browser")
	public void user_able_to_open_a_any_browser() throws InterruptedException {
		ZooplaStepdef.initialization();
		pf = new LoginElementsPage();
	  Thread.sleep(5000);  //wait 5 sec
	}
	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) throws InterruptedException {
	    driver.get(url);
	    Thread.sleep(5000);  //wait 5 sec
	}
	@When("User able to click on sign-in button")
	public void user_able_to_click_on_sign_in_button() throws InterruptedException {
	    pf.getClickOnSignButton().click();
	}
	@When("User able to enter valid userName & password")
	public void user_able_to_enter_valid_user_name_password() {
	    pf.getUserNameAndPwd("nbably2012@gmail.com", "nbablee1234");
	}
	@When("User able to click on login button")
	public void user_able_to_click_on_login_button() {
		//CommonUtility.getActionClick(pf.getSignBTN());
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(pf.getSignBTN()));
		//WaitHelper.waitUntilElementToBePresent(pf.getSignBTN());
		//CommonUtility.getJSClick(pf.getSignBTN());
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].c;ick();",pf.getSignBTN());
		//Actions obj = new Actions(driver);
		//obj.click(pf.getSignBTN()).build().perform();
	 // pf.getSignBTN().click();  
	pf.getSignBTN().click();    
	}
	@Then("User can verify the user information {string} on the grid")
		
	public void user_can_verify_the_user_information_on_the_grid(String text) {
	  // String ActualRe ="Welcome back to your account";
	   /*if(text.equals(pf.getVerifyText().getText())) {  //2nd way of doing verification
	   System.out.println("My test case is pass");
	} else {
		
	System.out.println("My test case is fail");
}*/
		
		CommonUtility.getVerifyTheResult1(text, pf.getVerifyText().getText());
	}
}
	  // Assert.assertEquals(text, pf.getVerifyText().getText());//First way of doing verification
	   //System.out.println(pf.getVerifyText().getText());
	   //System.out.println("Expected $Actual are Equal");
	   
//}
//}