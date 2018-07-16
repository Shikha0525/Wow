package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SingleUserNotFound {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[3]") private WebElement usernotfound;
	@FindBy(xpath="//*[@id=\"console\"]/div[2]/div[1]/p/strong/span") private WebElement request;
    @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span") private WebElement response;
	
	public SingleUserNotFound(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void UserNotFound() {
		
		usernotfound.click();
		String expected="/api/users/23";
		String actual=request.getText();
		String responsestatus=response.getText();
		System.out.println("UserNotFound"+responsestatus);
		Assert.assertEquals(actual, expected);
		
		
	}
    
	
	

}
