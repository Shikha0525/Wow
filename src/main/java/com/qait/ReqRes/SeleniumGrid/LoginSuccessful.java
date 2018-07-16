package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginSuccessful {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[13]")private WebElement login;
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/span")private WebElement request; 
	 @FindBy(className="response-code")private WebElement response;
	 public LoginSuccessful(WebDriver driver) {
		
		    this.driver=driver;
			PageFactory.initElements(driver, this);
	 }
	
	 public void verifyLoginSuccessful() {
		 
		 login.click();
		 String actual=request.getText();
		 String expected="/api/login";
		 String result=response.getText();
		 System.out.println("LoginSuccessful"+result);
		 Assert.assertEquals(actual, expected);
	 }

}
