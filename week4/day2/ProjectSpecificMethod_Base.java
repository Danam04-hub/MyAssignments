package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProjectSpecificMethod_Base {
	
	

		public ChromeDriver driver;
		@Parameters ({"url","username","password"})
		@BeforeMethod
		public void preConditions(String URL, String uName, String pWord) {
			//Initialize ChromeDriver
			driver = new ChromeDriver();
			//Load the URL
			driver.get("https://login.salesforce.com/");
			//Maximize the browser
			driver.manage().window().maximize();
			
			
			//ChromeOptions instance to customize Chrome
			//ChromeOptions options = new ChromeOptions();

			// Adding an argument to disable notifications
			//options.addArguments("--disable-notifications");
			// Initialize ChromeDriver with the ChromeOptions
			//ChromeDriver driver = new ChromeDriver(options);
			
			//Initialize ChromeDriver
			//ChromeDriver driver = new ChromeDriver();
			//Load the URL
			driver.get("https://login.salesforce.com/");
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Enter the Username
			driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
			
			//Enter the Password
			driver.findElement(By.id("password")).sendKeys("Sales@123");
			//Click on login button
			driver.findElement(By.id("Login")) .click();
				

}


@AfterMethod
public void postonditions() {
	driver.close();

}
}

