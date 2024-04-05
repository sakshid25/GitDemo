package section11;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//To get links count on that web page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//to get links in the footer section only
		//limiting the scope of the driver
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//to get links count in 1st column of footer page
		WebElement coloumnDriver = footerDriver.findElement(By.xpath("//div/table/tbody/tr/td/ul[1]"));
		System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
		
		//click on each link in the coloumn
		for (int i=1;i<coloumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clicklinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clicklinktab);
			Thread.sleep(5000L);
			
			
			
			
		}
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();
		
			

			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}


		
		
	}

