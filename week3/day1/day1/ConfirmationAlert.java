package week3.day1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	private static Alert cinfirmAlert;
	private static Alert confirmAlert;

	public static void main(String[] args) {
		//Initialize the WebDriver (ChromeDriver)
				ChromeDriver driver=new ChromeDriver();
				
				//Loading the URL
				driver.get("https://www.leafground.com/alert.xhtml");
				
				//Maximize the browser window
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
				
				//By Alert;
				
				
				//Alert confirmAlert;
				
				//Alert alert = driver.switchTo().alert();
				//System.out.println(alert.getText());
				//alert.accept();
				
				
				Alert confirmAlert=driver.switchTo().alert();
				String text =confirmAlert.getText();
				System.out.println(text);
				confirmAlert.accept();
				
				
				
				
				
				
				
				
				
				
			

	}

	
	
}
