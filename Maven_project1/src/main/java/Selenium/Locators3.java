package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Traverse from child to child - sibling traverse
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]")).getText());
		//Traverse from child to parent to child (or grandparent to grandparent's child
		System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling::button[1]/parent::div/button[2]")).getText());
		
		
	}

}
