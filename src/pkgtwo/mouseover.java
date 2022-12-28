package pkgtwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		WebElement img =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		Actions action = new Actions(driver);
		
		action.contextClick(img).click().perform();
		
		WebElement menu =driver.findElement(By.xpath("//*[@id='dm2m1i2tdT']"));
		action.moveToElement(menu).perform();
		Thread.sleep(2000);
		WebElement menu2 =driver.findElement(By.xpath("//*[@id='dm2m8i4tdT']"));
		action.moveToElement(menu2).click().perform();
		Set<String> handlesid = driver.getWindowHandles();
		
		List<String> window =new ArrayList<String>(handlesid);
		
		driver.switchTo().window(window.get(1));
		String title = driver.getTitle();
		System.out.println("title is " +title);
		

	}

}
