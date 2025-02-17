package week4.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChildStaticParametrization extends StaticParameterization {
	@Test
	public void salesForce() {
		
		//Click on Toggle menu button
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
				
		//Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
				
		//Pass the input Legal Entities in search box
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Legal Entities");
				
		//Click on "Legal Entities" from App Launcher
		driver.findElement(By.xpath("//span[@class='slds-truncate label-display']//mark[text()='Legal Entities']")).click();
				
		//Click on the DropDown icon in the legal Entities tab
		Actions subMenu = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement legalEntity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='slds-truncate' and text()='Legal Entities']")));
		subMenu.click(legalEntity).perform();
				
		//Click on New Legal Entity
		driver.findElement(By.className("forceActionLink")).click();
				
		//Enter legal Entity name
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Quickbee");
		
		//Enter the Company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		//Enter Description
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		//Select Status as 'Active' 
		WebElement statusDropDown = driver.findElement(By.xpath("//div[@class='slds-combobox_container']//button"));
		driver.executeScript("arguments[0].click();", statusDropDown);
		
		WebElement statusValue = driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Active']"));
		driver.executeScript("arguments[0].click();", statusValue);
		
		//Click on Save 
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		//Verify the Alert message (Complete this field) displayed for Name
		boolean toaster = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		String legalName = driver.findElement(By.xpath("//span[contains(@class='toastMeassage')]/a/div")).getText();
		
		if(toaster) {
			System.out.println("Success confirmation is displayed!.. and the legal name is:" + legalName);
		}
		else {
			System.out.println("Success confirmation is not displayed!..");
		}

	}
}
