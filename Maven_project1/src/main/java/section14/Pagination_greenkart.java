package section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination_greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//scan the name column with getText ->Guava(present on next page) ->print the price of Rice
		List<String> price;
		do
		{
			List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
			
			price = elements.stream().filter(s->s.getText().contains("Cheese")).map(s->getPriceofVeggie(s)).collect(Collectors.toList());
			
			
			
			price.forEach(a->System.out.println(a));
	

			if (price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		}while(price.size()<1);
	}

	public static String getPriceofVeggie(WebElement s)
	{
		String value=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return value;
	}
}
