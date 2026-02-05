package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame("iframeResult");
		
		//click on Try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click(); 
		
		//click and accept Alert
		driver.switchTo().alert().accept();
		
		WebElement result = driver.findElement(By.id("demo"));
		String text =result.getText();
		
		System.out.println("Result: " +text);
		
		if(text.contains("You pressed OK!")) {
			System.out.println("Test Passed : OK button Clicked");
		}
		
		
		
		driver.quit();

	}

}
