package section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablegrids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int sum = 0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i=0;i<values.size();i++)
		{
			System.out.println(Integer.parseInt(values.get(i).getText()));
			//to add values
			sum=sum + Integer.parseInt(values.get(i).getText());
		}
		
			System.out.println(sum);
			
			//Total Amount Collected: 296
			//Parsing string
			int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			Assert.assertEquals(sum, total);
			
			
			
			
		}
	}


