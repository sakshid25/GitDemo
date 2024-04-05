package section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomMethods_greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//scan the name column with getText ->Rice ->print the price of Rice
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> price = elements.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceofVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
	}
	

	public static String getPriceofVeggie(WebElement s)
	{
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
		
	}
}
