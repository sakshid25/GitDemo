package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//waiting for objects to show on page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//id,name,className
		driver.findElement(By.id("inputUsername")).sendKeys("susan");
		driver.findElement(By.name("inputPassword")).sendKeys("peter123");
		driver.findElement(By.className("signInBtn")).click();
		
		//cssSelector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//linkText
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//wait 2 sec as the page is in changing(sliding) state so to avoid interception error wait until the view is stable
		Thread.sleep(1000);
		
		
		//xpath and cssSelector
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Susan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("susan@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		//using index for xpath and cssSelector(child items)
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("susan@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234");
		
		//using only tagnames, parent to child traverse technique(xpath)
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345");
		
		//classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//using only tagnames, parent to child traverse technique(cssSelector)
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//customized xpath using (tagnames and attributes) and traverse method
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);//as again the page slides
		
		//cssSelector using id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		//cssSelector using Regular Expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		//xpath using Regular Expression
		driver.findElement(By.xpath("//button[contains(@class,'signIn')]")).click();
		
		
		driver.close();
	}

}
