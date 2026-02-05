package week5.day1;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//"Conditions of Use and Sale
		WebElement useCondition = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		//Scroll down to the "Conditions of Use and Sale" section at the bottom of the page using Actions class.
		
		Actions action= new Actions(driver);
		action.scrollToElement(useCondition).perform();
		
		//Get the text of "Conditions of Use and Sale" and print it in the console.
		
		String useCondText= useCondition.getText();
		System.out.println(useCondText);
		
		//take a screenshot of the displayed webpage.
		File source=driver.getScreenshotAs(OutputType.FILE);
		
		File desti= new File("./Snapshot/sample.png");
		
		FileUtils.copyFile(source, desti);		
		
	}

}
