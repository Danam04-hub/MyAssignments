package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadFuctionality {

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
		driver.findElement (By.linkText("CreateLead")).click();
		
			
	}

}
