package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
				
		//Loading the URL
		driver.get("https://www.amazon.in/");
				
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Search phones in the search field 
		driver.findElement (By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement (By.id("nav-search-submit-button")).click();
		
		//Find the lowest price from the list of phones 
		
		

	}

}
