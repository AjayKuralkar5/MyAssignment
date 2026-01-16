package week2.day2.week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	//Click on the Create new account button.
	driver.findElement(By.linkText("Create new account")).click();
	
	//Enter the First name.
	driver.findElement(By.name("firstname")).sendKeys("Rockstar");
	
	//Enter the Surname.
	driver.findElement(By.name("lastname")).sendKeys("Smith");
	
	//Enter the Mobile number or email address.
	driver.findElement(By.name("reg_email__")).sendKeys("asd.ghjk@gamail.com");
	
    //Enter the New password.
	driver.findElement(By.name("reg_passwd__")).sendKeys("Asd@123");
	
	//Handle all three dropdowns in Date of birth
	//DayDropDwon
	WebElement daydropdown = driver.findElement(By.name("birthday_day"));
	Select s1= new Select(daydropdown);
	s1.selectByIndex(19);
	
	//MonthDropdown
	WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
	Select s2= new Select(monthDropdown);
	s2.selectByVisibleText("Jul");
	
	//YearDropDown
	WebElement yearDropdown= driver.findElement(By.name("birthday_year"));
	Select s3=new Select(yearDropdown);
	s3.selectByValue("2002");
	
	//Select the radio button in Gender.
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	
	//driver.close();
	
	
		
	}

}
