package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		//move to specific element
		a.moveToElement(move).build().perform();
		//to move and type in capital letters
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		// to move and select the written text
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("dresses").doubleClick().build().perform();
		//to move and right click
		a.moveToElement(move).contextClick().build().perform();
	}

}
