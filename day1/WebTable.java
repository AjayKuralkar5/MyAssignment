package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Print Total of Element in row
		List<WebElement> rowElement =driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td[1]"));
		int totalElement=rowElement.size();
		System.out.println(totalElement);
		
		//Print All Element in Row
		
		for(int i=0;i<rowElement.size();i++) {
			String allElemnts=rowElement.get(i).getText();
			System.out.println(allElemnts);
		}
		
	
	}

}
