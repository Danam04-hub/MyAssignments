package week4.day3;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChildDynamicParameterization extends DynamicParameterization {
	@BeforeTest                   //1
	public void setValue(){
		filename ="LegalEntity";
		
	}
	
	@Test (dataProvider = "sendData")
	public void testCase(String name) throws InterruptedException {
		

		//Click on the toggle menu button from the left corner 
		driver.findElement(By.xpath("//button/div[@class='slds-icon-waffle']")).click();
		Thread.sleep(5000);
		//Click View All and click Legal Entities from App Launcher 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("legal Entities");
		driver.findElement(By.xpath("//mark[contains(text(),'Legal ')]")).click();
		//Click on New Legal Entity 
		driver.findElement(By.xpath("//div[text()='New']")).click();
		//Enter Name as 'Salesforce Automation by *Name* (Parameterized value)
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(name);       		
		//Click on Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//Verify the Legal Entity Name
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println("legal Entity Name: "+text);
	
		
	}

}


