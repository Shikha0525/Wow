package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginUnSuccessful {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[14]")private WebElement login1;
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/span")private WebElement request; 
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span")private WebElement response;
	 public LoginUnSuccessful(WebDriver driver) {
		
		    this.driver=driver;
			PageFactory.initElements(driver, this);
	 }
	
	 public void verifyPostRegisterSuccessful() {
		 
		 login1.click();
		 String actual=request.getText();
		 String expected="/api/login";
		 String result=response.getText();
		 System.out.println("LoginUnSuccessful"+result);
		 Assert.assertEquals(actual, expected);
	 }

}
