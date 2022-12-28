package pkgtwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftwo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total rows are "+rows.size());
		List<WebElement>cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total columns are "+cols.size());
		
		for(int row =1;row<=25;row++) {
			for(int col =1;col<=cols.size();col++) {
		
			if(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td[2]")).getText().equalsIgnoreCase("M")) {
			
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+col+"]")).getText()+"\t");
			}
			
			
			}
			System.out.println();
			}	

	}

}
