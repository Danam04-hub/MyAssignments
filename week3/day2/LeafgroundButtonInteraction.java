package week3.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException  {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		Thread.sleep(2000);
				
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.id("j_idt88:j_idt90")).click();
				
		//Verify that the title of the page is ‘dashboard.’ 
		String titleOFPage = driver.getTitle();
		System.out.println("Title of the page after clicking the button Click and Confirm title: "+titleOFPage);
				
		//Navigate back to the page
		driver.navigate().back();
				
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		boolean enabledStatusButton = driver.findElement(By.id("j_idt88:j_idt90")).isEnabled();
		System.out.println("Button status is: "+enabledStatusButton);
				
		// Find and print the position of the button with the text ‘Submit.’ 
		Point locationOfButtonSubmit = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("The Button location is :"+locationOfButtonSubmit);
				
		//- Find and print the background color of the button with the text ‘Find the Save button color.’ 
		String cssValueSaveButton = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
		System.out.println("RGB value of save button: "+cssValueSaveButton);
				
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		Dimension sizeOfButton = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Dimesions of the button are: "+sizeOfButton);
				
		//- Close the browser window.
		driver.close();
		

	}

}
