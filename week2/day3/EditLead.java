package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Launch the browser
		//ChromeBrowser
		ChromeDriver driver=new ChromeDriver();
				
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
		  //Create Lead button
		  driver.findElement(By.linkText("Create Lead")).click();
		  //Enter a Company Name using xPath
		  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Leaf Taps");
		  //Enter a First Name using xPath
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Test");
		  //Enter a Last Name using xPath
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leaf");
		  //Enter the FirstName (Local) Field using xPath
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("TELE");
		  //Enter the Department
		  driver.findElement(By.name("departmentName")).sendKeys("SDU");
		  //Enter the Description
		  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		  //Enter the E-mail address
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf101@gmail.com");
		  //Select State/Province as New York using Visible Text
		  WebElement sourceDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		  Select dd1=new Select(sourceDropdown);
		  dd1.selectByVisibleText("New York");
		  //Click on Create button
		  driver.findElement(By.className("smallSubmit")).click();
		  //Click on Edit button
		  driver.findElement(By.linkText("Edit")).click();
		  //Clear the Description
		  driver.findElement(By.name("description")).clear();
		  //Fill the Important Note Field with Any Text
		  driver.findElement(By.name("importantNote")).sendKeys("Note:Edit and Cleared the description");
		  //Click on Update button
		  driver.findElement(By.xpath("//div[@class='fieldgroup-body']/table[1]/tbody/tr[12]/td[2]/input")).click();
		  //Get the Title of the Resulting page
		  System.out.println(driver.getTitle());
		  
	    //Close the browser
		  driver.close();

	}

}
