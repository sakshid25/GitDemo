package Framework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class shopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String productName = "ADIDAS ORIGINAL" ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		//landingPage landingPage = new landingPage(driver);
		
		driver.findElement(By.id("userEmail")).sendKeys("Payback@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Payback@25");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> products = driver.findElements(By.cssSelector("div.mb-3"));
		WebElement prod = products.stream().filter(product -> product.findElement(By.cssSelector("b"))
				.getText().equals(productName)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		
		//for the loading disappering check
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
		w.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		

		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		
		List<WebElement> cartProducts = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
		boolean match = cartProducts.stream().anyMatch(cartProduct->cartProduct.getText().contains(productName));
		Assert.assertTrue(match);
		
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		/*//AutoSuggestive DropDown
		driver.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.cssSelector(".list-group-item span"));
		for (WebElement country:countries)
		{
			if (country.getText().equalsIgnoreCase("India"))
			{
				country.click();
				break;
			}
		}*/
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input[placeholder='Select Country']"))).click().sendKeys("India").build().perform();
		//a.sendKeys(driver.findElement(By.cssSelector("input[placeholder='Select Country']")), "India").build().perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".list-group-item span")));
		
		driver.findElement(By.xpath("(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")).click();
		driver.findElement(By.cssSelector(".action__submit")).click();
	}

}
