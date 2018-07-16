package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	
	WebDriver driver;
	@FindBy(className="tagline") private WebElement firstPageVerification;
	 

	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void launchHomePage(String url) {
	    
		driver.get(url);
	}
	
	public void IsHomePageDisplayed() {
		
		String ExpectedMessageDisplayed="Test your front-end against a real API";
		String ActualMessageDisplayed=firstPageVerification.getText();
		System.out.println(ActualMessageDisplayed);
		Assert.assertEquals(ActualMessageDisplayed, ExpectedMessageDisplayed);
		
	}
	

}
