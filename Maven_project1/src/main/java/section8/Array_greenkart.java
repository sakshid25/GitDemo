package section8;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Array_greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		//Creating array of products
		String[] itemsNeeded = {"Carrot","Tomato"};
		
		//List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		int j=0;
		for (int i=0; i<products.size();i++)
		{
			//Carrot - 1 Kg
			String[] name = products.get(i).getText().split("-");
			//name[0]=Carrot(space) and name[1]=(space)1 Kg
			String formattedName = name[0].trim();//to remove white space
			
			//Convert array to arraylist for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			//Check whether the name you extracted is present in the arrayList or not
			
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//button text is not stable so useing another locator
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				//not using break as it will find one product and stop
				
				if (j==itemsNeeded.length) //if j equal to itemsNeeded
				{
					break;
				}
				
			}
		}
	}

}
