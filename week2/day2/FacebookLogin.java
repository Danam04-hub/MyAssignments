package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
		
		//Loading the URL
		driver.get("https://www.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Click on the Create new account button
		//Text Based 
		//tagName[text()='text value in DOM'] 
		//a[text()='Create New Account']
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter the First name
		driver.findElement (By.name("firstname")).sendKeys("Penny");
		
		//Enter the Surname
		driver.findElement (By.name("lastname")).sendKeys("Foo");
		
		//Enter the Mobile number or email address
		driver.findElement (By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
		
		//Enter the New password
		driver.findElement (By.id("password_step_input")).sendKeys("Tuna@321");
		
		//Handle all three dropdowns in Date of birth
		//Day
		//Find the Element
		WebElement sourceDropdown = driver.findElement(By.id("day"));
		//Instantiate the Select Class
		Select dd=new Select(sourceDropdown);
		//By Value
	    dd.selectByValue("28");
	    
	    //Month
	  	//Find the Element
	  	WebElement sourceDropdown1 = driver.findElement(By.id("month"));
	  	//Instantiate the Select Class
	  	Select dd1=new Select(sourceDropdown1);
	  	//By Value
	  	dd1.selectByValue("5");
		
	    //Year
	  	//Find the Element
	  	WebElement sourceDropdown2 = driver.findElement(By.id("year"));
	  	//Instantiate the Select Class
	  	Select dd2=new Select(sourceDropdown2);
	  	//By Value
	  	dd2.selectByValue("2000");
	  	
	  	//Select the radio button in Gender
	  	//driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	  	driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
	  	
	  	driver.quit();	
	  	
	  	
		

	}

}
