package Assessment;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class world_population {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		String xpath_world="//div[@class='maincounter-number']/span";
		String xpath_today_thisyear =" //div[@class='label-counter']//parent::div//span[@class='rts-counter']";
		
		
		driver.get("https://www.worldometers.info/world-population/");
		System.out.println("Current World Population");
		PopulationData(xpath_world);
		System.out.println("Today and This Year population");
		PopulationData(xpath_today_thisyear);
		}
		

		public static void PopulationData(String xpath) {

		int count = 1;
		while(count<=10) {
				
			if(count == 10) break;
		List<WebElement> numbers = driver.findElements(By.xpath(xpath));
		
		for (WebElement number:numbers)
		{
			System.out.println(number.getText());
		}
		
		count++;
		}	
	
		}
}


