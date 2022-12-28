package pkgtwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	//	driver.get("https://www.google.com/");
		
	driver.get("https://www.sqltesting.com/about/");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.xpath("//div[@id='et-secondary-menu']//a"));
		for(int i=1;i<links.size();i++) {
			String linkname=links.get(i).getText();
			System.out.println(linkname);;
		}
		WebElement firstlink = driver.findElement(By.xpath("//div[@id='et-secondary-menu']//a"));
		
		System.out.println(firstlink.getText()+ "------first link");

	}

}
