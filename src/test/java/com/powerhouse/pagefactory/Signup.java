package com.powerhouse.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.powerhouse.datainitialization.DataInt;

public class Signup extends CommonBase{
	
	public Signup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.XPATH, using = "//*[@id=\"header-account\"]/ul/li[4]/a")
	public WebElement signup;
	
	@FindBy(how=How.ID, using = "firstname")
	public WebElement userfirstname;
	
	@FindBy(how=How.ID, using = "lastname")
	public WebElement userlastname;
	
	@FindBy(how=How.ID, using = "email_address")
	public WebElement useremail;
	
	@FindBy(how=How.ID, using = "password")
	public WebElement userpassword;
	
	@FindBy(how=How.ID, using = "password-confirmation")
	public WebElement userconfirmpassword;
	
	@FindBy(how=How.ID, using = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
	public WebElement signupsubmit;
	
	public void signUpUser(DataInt dataInt) {
		try {
			implicitWait();
			System.out.println("Sign Up");
			signup.click();
			userfirstname.sendKeys(dataInt.Ufname);
			userlastname.sendKeys(dataInt.Ulname);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			LOG.info(e.toString());
			
			
			
		}

	}

}
