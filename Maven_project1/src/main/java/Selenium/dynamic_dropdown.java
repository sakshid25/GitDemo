package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(2000);
		//giving index otherwise selenium will consider IXL present in departure as it starts scanning from top left
		//driver.findElement(By.xpath("(//a[@value='IXL'])[2]")).click();
		
		//Another way without index using only xpath
		//Parent child Relationship
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXL']")).click();
		
		//selecting current date from calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	
	}

}
