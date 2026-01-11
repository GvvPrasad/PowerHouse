package com.powerhouse.testscripts;

import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.powerhouse.pagefactory.AddToCart;
import com.powerhouse.pagefactory.DriverHome;
import com.powerhouse.pagefactory.Login;
import com.powerhouse.pagefactory.Signup;



public class Base {
	
	public DriverHome driverhome;
	public Login login;
	public AddToCart addtocart;
	public Signup signup;
	
	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			System.out.println("Browser Session Started");
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");
			
		} catch (WebDriverException e) {
			
			
		}
	}

	
	@AfterTest

	public void close() throws Exception {
		try {
			Thread.sleep(5000);
		    //driverhome.emailreport();
			//driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			

		}
	}

}
