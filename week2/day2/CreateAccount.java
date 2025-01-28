package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
		
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement (By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Frank");
		
		//Enter a description as "Selenium Automation Tester." 
		driver.findElement (By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry
		WebElement sourceDropdown1 = driver.findElement(By.name("industryEnumId"));
		//Instantiate the Select Class
		Select dd1=new Select(sourceDropdown1);
		//By Value
		dd1.selectByValue("IND_SOFTWARE");
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement sourceDropdown2 = driver.findElement(By.name("ownershipEnumId"));
		//Instantiate the Select Text
		Select dd2=new Select(sourceDropdown2);
		//By Text
		dd2.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement sourceDropdown3 = driver.findElement(By.id("dataSourceId"));
		//Instantiate the Select Text
		Select dd3=new Select(sourceDropdown3);
		//By Value
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement sourceDropdown4 = driver.findElement(By.id("marketingCampaignId"));
		//Instantiate the Select Text
		Select dd4=new Select(sourceDropdown4);
		//By Index
		dd4.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		//Select "United states" as the country using SelectByValue 
		//WebElement sourceDropdown5 = driver.findElement(By.id("generalCountryGeoId"));
		//Instantiate the Select Text
		//Select dd5=new Select(sourceDropdown5);
		//By Value
		//dd5.selectByValue("USA");
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement sourceDropdown6 = driver.findElement (By.id("generalStateProvinceGeoId"));
		//Instantiate the Select Text
		Select dd6=new Select(sourceDropdown6);
		//By Value
		dd6.selectByValue("TX");
		
		//Click the "Create Account" button 
		driver.findElement (By.className("smallSubmit")).click();
		
		//Close the browser window
		driver.findElement (By.linkText("Logout")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
