package section14;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stream_greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//click on column
		driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit name']")).click();
		
		
		//capture all the web elements into list
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all web elements into new(original) list
		List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list on step 3 - sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertEquals(sortedList, originalList);
		
	}

}
