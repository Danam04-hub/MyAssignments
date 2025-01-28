package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Launch the browser
		//ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
		

		//EdgeDriver driver=new EdgeDriver();

		//Loading the URL -get
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the browser
		driver.manage().window().maximize();

		//sendKeys - To enter data in text field
		//Enter the username -findElement
		
		driver.findElement (By.id("username")).sendKeys("Demosalesmanager");

		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on the Leads
		driver.findElement(By.linkText("Leads")).click();

		//Click on the CreateLead
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter the companyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		//Enter the firstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");

		//Enter the lastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");


		//Handling the dropdown
		//Step1: Find the Element
		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		

		//Step2: Instantiate the Select Class
		Select dd1=new Select(sourceDropdown);

		//Sep3: Select the option
		dd1.selectByIndex(3);

		//By Value
		//dd1.selectByValue("LEAD_EXISTCUST");

		//By Text
		//dd1.selectByVisibleText("Public Relations");

		//Click Create lead button
		//driver.findElement(By.name("submitButton")).click();
		
		//Handling the dropdown
		//Step1: Find the Element
		
		
		WebElement sourceDropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		
		//Step2: Instantiate the Select Class
		Select dd2=new Select(sourceDropdown2);
		
		//By Value
		dd2.selectByValue("IND_AEROSPACE");
		
		//Click Create lead button
		//driver.findElement(By.name("submitButton")).click();
		
		
				

		
		

	}

}
