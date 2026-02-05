package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	//Declare driver globaly
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	    driver =new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter pass
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}

}
