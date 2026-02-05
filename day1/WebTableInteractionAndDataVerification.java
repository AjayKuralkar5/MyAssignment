package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteractionAndDataVerification {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter "MAS" as the "From" station.
		WebElement fromStation=driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		
		
		//Enter "MDU" as the "To" station.
		WebElement toStation=driver.findElement(By.id("txtStationTo"));
		 toStation.clear();
		 toStation.sendKeys("MDU");
		
		//Uncheck the "Sort on Date" checkbox
		WebElement sortDate=driver.findElement(By.id("chkSelectDateOnly"));
		if(sortDate.isSelected()) {
			sortDate.click();
		}
		
		//Retrieve the train names from the web table.
		List<WebElement> allTrains=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		
		for(int i=0;i<allTrains.size();i++) {
			
			String TrainsName=allTrains.get(i).getText();
			System.out.println(TrainsName);
			
		}
		
		
		
		
	}

}
