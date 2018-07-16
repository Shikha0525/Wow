package com.qait.ReqRes.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	
      public static RemoteWebDriver driver1;
      
	
      WebDriver driver;	
      HomePage homepage;
      ListUsers listuser;
      SingleUSer singleuser;
      SingleUserNotFound singleusernotfound;
      ListResource list;
      SingleResource sr;
      SingleResourceNotfound srnf; 
      Post post;
      Put put;
      Patch patch;
      Delete delete;
      PostRegisterSuccessful prs;
      PostRegisterUnSuccessful prus;
      LoginSuccessful login;
      LoginUnSuccessful login1;
      Delayed delay;
      
        @BeforeTest
        public void beforeTest() throws MalformedURLException {
     
	         String exepath = "/home/qainfotech/Downloads/chromedriver";
		     System.setProperty("webdriver.chrome.driver",exepath);
		     driver = new ChromeDriver();
        }
  
       @Test
       public void test01HomePage() {
	  
	       homepage = new HomePage(driver);
	       homepage.launchHomePage("https://reqres.in/");
	       homepage.IsHomePageDisplayed();
       }
  
       @Test
       public void test02ListUsers() {
	  
	       listuser=new ListUsers(driver);
	       listuser.displayUserName();
	   }
       
       @Test
       public void test03SingleUsers() {
    	   
    	   singleuser=new SingleUSer(driver);
    	   singleuser.isSingleUserDisplayed();
       }
       
       @Test
       public void test04SingleUserNotFound() {
    	   
    	   singleusernotfound=new SingleUserNotFound(driver);
    	   singleusernotfound.UserNotFound();
    	   
       }
       
       @Test
       public void test05ListUser() {
    	   
    	   list=new ListResource(driver);
    	   list.listResource();
    	   
       }
       
       @Test
       public void test06SingleUser() {
    	   
    	   sr=new SingleResource(driver);
    	   sr.SingleResource();
       }
       
       @Test
       public void test07SingleResourceNotfound() {
    	   
    	   srnf=new SingleResourceNotfound(driver);
    	   srnf.SingleResourceNotFound();
       }
       
       @Test
       public void test08Post() {
    	   
    	   post=new Post(driver);
    	   post.verifyPost();
       }
       
       @Test
       public void test09Put() {
    	   
    	   put=new Put(driver);
    	   put.verifyPut();
       }
       
       @Test
       public void test10Patch() {
    	   
    	   patch=new Patch(driver);
    	   patch.verifyPatch();
       }
       
       @Test
       public void test11Delete() {
    	   
    	   delete=new Delete(driver);
    	   delete.verifyDelete();
       }
       
       @Test
       public void test12PostRegisterSuccessful() {
    	   
    	   prs=new PostRegisterSuccessful(driver);
    	   prs.verifyPostRegisterSuccessful();
       }
       
       @Test
       public void test13PostRegisterUnSuccessful() {
    	   
    	   prus=new PostRegisterUnSuccessful(driver);
    	   prus.verifyPostRegisterUnSuccessful();
    	   
       }
       
       @Test
       public void test14LoginSuccessful() {
    	   
    	   login=new LoginSuccessful(driver);
    	   login.verifyLoginSuccessful();
       }
       
       @Test
       public void test15LoginUnSuccessful() {
    	   
    	   login1=new LoginUnSuccessful(driver);
    	   login1.verifyPostRegisterSuccessful();
       }
       
       @Test
       public void test16Delayed() {
    	   
    	   delay=new Delayed(driver);
    	   delay.verifyDelayed();
       }
       
  
}
