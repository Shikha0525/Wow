package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SingleResource {
	
	 WebDriver driver;
	 @FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[5]")private WebElement single;
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/span")private WebElement request; 
	 @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span")private WebElement response;
	 public SingleResource(WebDriver driver) {
		
		    this.driver=driver;
			PageFactory.initElements(driver, this);
	 }
	
	 public void SingleResource() {
		 
		 single.click();
		 String actual=request.getText();
		 String expected="/api/unknown/2";
		 String result=response.getText();
		 System.out.println("SingleResource"+result);
		 Assert.assertEquals(actual, expected);
	 }
	

}
