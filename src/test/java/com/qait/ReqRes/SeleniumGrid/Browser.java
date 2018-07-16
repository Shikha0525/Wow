package com.qait.ReqRes.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Browser {
	@Test
	public void LaunchBrowser(String[] args) throws MalformedURLException {
			  
		  DesiredCapabilities capabilities =  new DesiredCapabilities();
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		  capabilities.setCapability(CapabilityType.VERSION, "67.0.3396.99");
	      RemoteWebDriver remoteWD = null;
	      remoteWD = new RemoteWebDriver(new URL("http://10.0.24.136:4444/wd/hub"),capabilities);
	  	  remoteWD.get("http://www.google.com");
		  
	}

}
