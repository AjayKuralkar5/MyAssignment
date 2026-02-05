package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLeads extends ProjectSpecificMethod {
	
	@Test
	public void createLeads() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.name("submitButton")).click();

}
}
