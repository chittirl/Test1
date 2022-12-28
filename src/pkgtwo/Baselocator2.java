package pkgtwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselocator2 {
	WebDriver driver;
	
	public void openBrowser() throws InterruptedException {	
		//WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();

		String url1= "https://perfectdomain.com/domain/jkmart.com";
		driver.get(url1); 
		Thread.sleep(5000);
		WebElement BuyNowButton= driver.findElement(By.id("dn-profile-purchase"));
		BuyNowButton.click();
		Thread.sleep(5000);

		String	url2="https://www.jiomart.com/";
		driver.get(url2);
		Thread.sleep(5000);
		WebElement premiumFruit= driver.findElement(By.linkText("Premium Fruits"));
		premiumFruit.click();
		Thread.sleep(5000);

		WebElement LuggageLink= driver.findElement(By.partialLinkText("Luggage"));
		LuggageLink.click();

	}

	public static void main(String[] args) throws InterruptedException {
		Baselocator2 bl= new Baselocator2();
		bl.openBrowser();

	}



}
