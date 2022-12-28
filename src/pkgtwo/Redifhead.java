package pkgtwo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifhead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total rows are "+rows.size());
		List<WebElement>cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total columns are "+cols.size());
		
		List<WebElement>heads=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println("Total headers are "+heads.size());
		
		
			for(int head =1;head<=heads.size();head++) {
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th["+head+"]")).getText()+"\t");
			}
			System.out.println();
	}

}
