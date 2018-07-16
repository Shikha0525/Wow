package com.qait.ReqRes.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SingleUSer {

	  WebDriver driver;
	  @FindBy(xpath="//*[@id=\"console\"]/div[1]/ul/li[2]") private WebElement getSingleUser;
	  @FindBy(className="url") private WebElement singleUserResponse; 
	  @FindBy(xpath="//*[@id=\"console\"]/div[2]/div[2]/p/strong/span") private WebElement getresponse;
      public SingleUSer(WebDriver driver) {
		
    	  this.driver=driver;
  		  PageFactory.initElements(driver, this);
	  }
      
      public void isSingleUserDisplayed() {
    	  
    	  getSingleUser.click();
    	  String actual=singleUserResponse.getText();
    	  String response=  getresponse.getText();
    	  System.out.println("SingleUserResponse :"+response);
    	  String expected="/api/users/2";
    	  Assert.assertEquals(actual, expected);
    	  
      }

}
