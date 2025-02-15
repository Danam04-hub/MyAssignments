package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod extends ProjectSpecificMethod_Base {
	
		

	@Test
	public void createLegalEntity()throws InterruptedException {
		//Click on the toggle menu button from the left corner  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		//Click View All and click Legal Entities from App Launcher 
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Pass the input "Legal Entities" in the search box 
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
		//Click on "Legal Entities" from App Launcher
		driver.findElement(By.xpath("//span[@class='slds-truncate label-display']//mark[text()='Legal Entities']")).click();
		//Click on the Dropdown icon in the legal Entities tab
		driver.findElement(By.xpath("//button[@title='Select a List View: Legal Entities']")).click();
		//Click on New Legal Entity
		driver.findElement(By.xpath("//div[@title='New']")).click();
		//Enter the Company name as 'TestLeaf'
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		//Enter Description as 'Salesforces'
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		Thread.sleep(3000);
		Actions actScroll=new Actions(driver);
		WebElement comboButtonElement = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		actScroll.scrollToElement(comboButtonElement).click().perform();
		Thread.sleep(3000);
		//Select Status as 'Active'	
		WebElement statusDropdown = driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button"));
		//use javascript executor
		driver.executeScript("arguments[0].click();", statusDropdown);
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//click on save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String verifyFeild = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		System.out.println(verifyFeild + " is displayed");
		//close the error window and window
		driver.findElement(By.xpath("//button[@title='Close error dialog']")).click();
		driver.findElement(By.xpath("//button[@title='Close this window']")).click();
	}
	
	
	
}
