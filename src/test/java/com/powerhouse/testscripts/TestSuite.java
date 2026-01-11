package com.powerhouse.testscripts;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.powerhouse.datainitialization.DataInt;
import com.powerhouse.utilities.ExcelSheetObjects;
import com.powerhouse.utilities.SetupEnvironment;
import com.powerhouse.utilities.Util;
import com.powerhouse.utilities.Xls_Reader;





public class TestSuite extends Base {
	
	public static final Logger LOG = Logger.getLogger(TestSuite.class);
	String testDataPath = System.getProperty("user.dir")+ "\\src\\main\\java\\com\\Powerhouse\\test\\data\\TestData.xlsx";
	public Xls_Reader xls = new Xls_Reader(testDataPath);
	
	/*@Test(description = "Login Powerhouse", dataProvider = "getLogin", priority = 1)
	public void loginWithCredentials(DataInt dataInt) {
		try {
			login = driverhome.getLogin();
			login.signIn(dataInt);
			addtocart = driverhome.getAddtoCart();
			addtocart.addCart(dataInt);
			addtocart.continueShopping(dataInt);
			addtocart.editProduct(dataInt);
			//SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "CompGoParts Scenarios");
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
	}
	
	
	@DataProvider
	public Iterator<Object[]> getLogin() {
			return Util.getLoginData("Login", xls).iterator();

		}*/
	
	@Test(description = "Signup Powerhouse", dataProvider = "getSignup", priority = 1)
	public void signupPh(DataInt dataInt) {
		try {
			signup = driverhome.getsignup();
			signup.signUpUser(dataInt);
			
			//SetupEnvironment.createXLSReport(ExcelSheetObjects.KEYWORD_PASS, ExcelSheetObjects.LoginWithValidCredentials, "CompGoParts Scenarios");
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
	}
	
	
	@DataProvider
	public Iterator<Object[]> getSignup() {
			return Util.getSignupData("Signup", xls).iterator();

		}

}
