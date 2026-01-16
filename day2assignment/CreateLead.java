package week2.day2.week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("http://leaftaps.com/opentaps/");
		
		//Enter user name
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 
	 //Enter Password
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 
	 //Click on login button
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 //Click on CRMSFA
	 
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 
	 //Click on the "Leads" tab.
	 driver.findElement(By.linkText("Leads")).click();
	 
	 //Click on the "Create Lead" button.
	 driver.findElement(By.linkText("Create Lead")).click();
	 
	 //Enter a CompanyName.
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 
	 //Enter a FirstName
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arjun");
	 
	 //Enter a LastName.
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
	 
	 //Enter Title
	 driver.findElement(By.name("generalProfTitle")).sendKeys("Java Automation Testing");
	 
	 //Click on Create Lead
	 driver.findElement(By.name("submitButton")).click();
	 
	 //Verify that the Title is displayed correctly.
	 String title = driver.getTitle();
		System.out.println(title);
		 
	 
	 

	}

}
