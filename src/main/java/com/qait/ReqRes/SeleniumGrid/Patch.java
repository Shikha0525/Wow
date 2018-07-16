package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Patch {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[9]")private WebElement patch;
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/span")private WebElement request; 
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span")private WebElement response;
	 public Patch(WebDriver driver) {
		
		    this.driver=driver;
			PageFactory.initElements(driver, this);
	 }
	
	 public void verifyPatch() {
		 
		 patch.click();
		 String actual=request.getText();
		 String expected="/api/users/2";
		 String result=response.getText();
		 System.out.println("Patch"+result);
		 Assert.assertEquals(actual, expected);
	 }

}
