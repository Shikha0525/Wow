package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ListUsers {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[1]") private WebElement getUserName;
	@FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span") private WebElement userListResponse;
	@FindBy(className="url") private WebElement geturl;
	
	public ListUsers(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	public void displayUserName() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		getUserName.click();
		String actual="/api/users?page=2";
		String expected=geturl.getText();
		System.out.println(expected);
		String response=userListResponse.getText();
		System.out.println("ListUser:"+response);
		Assert.assertEquals(actual, expected);
		
	}

}
