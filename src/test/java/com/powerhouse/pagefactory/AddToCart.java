package com.powerhouse.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mysql.jdbc.log.Log;
import com.powerhouse.datainitialization.DataInt;

public class AddToCart extends CommonBase implements reusable {

	public AddToCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"mainmenu\"]/ul/li[1]/a/span")
	public WebElement home;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"mainmenu\"]/ul/li[2]/a/span[1]")
	public WebElement valvesprings;
	
	@FindBy(how = How.LINK_TEXT, using = "Flathead")
	public WebElement flathead;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[5]/ol/li[1]/div/div[2]/div[3]/div/div/form/button")
	public WebElement addproduct;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"minicart\"]/div[1]/span/span[3]")
	public WebElement cart;
	
	@FindBy(how = How.LINK_TEXT, using = "View and Edit Cart")
	public WebElement viewandedit;
	
	@FindBy(how = How.XPATH, using = "//div[@class='field qty']/div/input")
	public WebElement editqty;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"form-validate\"]/div[2]/button[2]/span")
	public WebElement updatecart;
	
	@FindBy(how = How.LINK_TEXT, using = "Continue Shopping")
	public WebElement contshop;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"mainmenu\"]/ul/li[7]/a")
	public WebElement ohvcams;
	
	@FindBy(how = How.LINK_TEXT, using = "Stock")
	public WebElement stock;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[5]/ol/li[2]/div/div[2]/div[3]/div/div/form/button")
	public WebElement flatheadprod;   
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[2]/div/div[2]/div[3]/div/div/form/button")
	public WebElement stockprod;     
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
	public WebElement visibletext; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping-cart-table\"]/tbody[2]/tr[2]/td/div/a[2]")
	public WebElement editprod;
	
	@FindBy(how = How.ID, using = "qty")
	public WebElement qty;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-updatecart-button\"]")
	public WebElement reupdatecart; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"empty_cart_button\"]")
	public WebElement clearcart; 
	
	public void addCart(DataInt dataInt) {
		try {
			home.click();
			mouseOver(valvesprings);
	        flathead.click();
	        implicitWait();
	        LOG.info("Loading FlatHead Page...");
	        flatheadprod.submit();
	        LOG.info("Product Added");
	        explicitWaitVisible(visibletext);
	        miniCart();
	        editqty.clear();
	        editqty.sendKeys("2");
	        updatecart.click();
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
		
	}
	
	
	public void continueShopping(DataInt dataInt) {
		try {
			contshop.click();
			implicitWait();
			 LOG.info("HomePage");
			mouseOver(ohvcams);
			stock.click();
			implicitWait();
			stockprod.submit();
			explicitWaitVisible(visibletext);
			miniCart();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void editProduct(DataInt dataInt) {
		try {
			editprod.click();
			implicitWait();
			qty.clear();
			qty.sendKeys("2");
			reupdatecart.click();
			implicitWait();
			clearcart.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void miniCart() {
		try {
			LOG.info("Minicart Page");
			implicitWait();
			scrollPage();
	  	    mouseOver(cart);
	        explicitWait(viewandedit);
	        viewandedit.click();
	        implicitWait();
	        LOG.info("Displaying Cart Page");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
    }

}
