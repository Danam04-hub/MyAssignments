package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement (By.id("username"));
		driver.findElement (By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement (By.id("password")).sendKeys("crmsfa");
		driver.findElement (By.className("decorativeSubmit")).click();
		driver.findElement (By.linkText("CRM/SFA")).click();
		driver.findElement (By.linkText("Leads")).click();
		driver.findElement (By.linkText("Create Lead")).click();
		driver.findElement (By.id("createLeadForm_firstName")).sendKeys("Danam");
		driver.findElement (By.id("createLeadForm_lastName")).sendKeys("Maruthai");
		driver.findElement (By.id("createLeadForm_companyName")).sendKeys("OrangeHub");
		driver.findElement (By.name("generalProfTitle")).sendKeys("Mrs");
		driver.findElement (By.className("smallSubmit")).click();
		driver.findElement (By.linkText("Logout")).click();
		
	}

}
