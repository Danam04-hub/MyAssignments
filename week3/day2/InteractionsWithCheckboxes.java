package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException  {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
		//Click on the "Basic Checkbox.” 
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Click on the "Notification Checkbox." 
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Verify that the expected message is displayed. 
		String expectedMessage1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Message for Notification Checkbox: "+expectedMessage1);
		//Click on your favorite language 
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();                  
										
		//Verify which tri-state option has been chosen.
        WebElement element1 = driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p"));
		String text = element1.getText();
		System.out.println("Tri-State option: "+text);
		        
		//Click on the "Toggle Switch." 
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		//Verify that the expected message is displayed. 
		String expectedMessage2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Message for Toggle Switch: "+expectedMessage2);
		//Verify if the Checkbox is disabled. 
		boolean enabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.out.println("Checkbox is enable: "+enabled);
		//Select multiple options on the page (details may be needed). 
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		//Perform any additional actions or verifications required. 
		//Search the text 
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext')]")).sendKeys("Amsterdam");
		//Select Amsterdam
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[9]/div[1]/div[2]")).click();
		//Close the dropdown
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		String dropdownText = driver.findElement(By.xpath("//span[text()='Amsterdam']")).getText();
		System.out.println("Dropdown Selection: "+dropdownText);
				
		//Close the web browser.
		driver.close();
		

	}

}
