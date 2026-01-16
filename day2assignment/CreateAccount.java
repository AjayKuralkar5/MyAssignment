package week2.day2.week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		//Enter user name
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 
	 //Enter Password
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 
	 //Click on login button
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 //Click on CRMSFA
	 
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 
	 //Click on Account tab
	 driver.findElement(By.linkText("Accounts")).click();
	 
	 //Click on the "Create Account" button.
	 driver.findElement(By.linkText("Create Account")).click();
	 
	 //Enter Account Name
	 driver.findElement(By.id("accountName")).sendKeys("TestUser2");
	 
	 //REnter Description
	 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	 
	 //Select "ComputerSoftware" as the industry.
	 WebElement sourceElement = driver.findElement(By.name("industryEnumId"));
	 
	 Select s = new Select(sourceElement);
	 s.selectByVisibleText("Computer Software");
	 
	 //Select "S-Corporation" as ownership using SelectByVisibleText
	 
	 WebElement sourceElement2 = driver.findElement(By.name("ownershipEnumId"));
	 
	 Select s2 = new Select(sourceElement2);
	 s2.selectByVisibleText("S-Corporation");
	 
	 //Select "Employee" as the source using SelectByValue.
	 
     WebElement sourceElement3 = driver.findElement(By.name("dataSourceId"));
	 
	 Select s3 = new Select(sourceElement3);
	 s3.selectByValue("LEAD_EMPLOYEE");
	 
	 //Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
	 
 WebElement sourceElement4 = driver.findElement(By.name("marketingCampaignId"));
	 
	 Select s4 = new Select(sourceElement4);
	 s4.selectByIndex(6);
	 
	 //Select "Texas" as the state/province using SelectByValue.
	 
 WebElement sourceElement5 = driver.findElement(By.name("generalStateProvinceGeoId"));
	 
	 Select s5 = new Select(sourceElement5);
	 s5.selectByValue("TX");
	 
	 //Click the "Create Account" button.
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 //get Title
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 
	 //Close browser
	 Thread.sleep(3000);
	 driver.close();
	 
	 
	 
	}

}

