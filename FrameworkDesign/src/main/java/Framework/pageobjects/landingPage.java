package Framework.pageobjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.AbstractComponents.AbstractComponents;


public class landingPage extends AbstractComponents{
	//push the locators belonging to landing page
	WebDriver driver;
	
	//creating constructor
	public landingPage(WebDriver driver)
	{
		super(driver);
		//Initialization steps can be written in constructor as it will always get executed first
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//driver.findElement(By.id("userEmail"));
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement PasswordEle;
	
	@FindBy(id="login")
	WebElement submit;
	
	public ProductCatalogue LoginApplication(String email, String password)
	{
		userEmail.sendKeys(email);
		PasswordEle.sendKeys(password);
		submit.click();
		ProductCatalogue ProductCatalogue = new ProductCatalogue(driver);
		return ProductCatalogue;
	}
	
	public  void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
