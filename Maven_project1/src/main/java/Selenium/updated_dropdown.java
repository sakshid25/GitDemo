package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//selecting 5 passengers
public class updated_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();//4 times
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		

	}

}
