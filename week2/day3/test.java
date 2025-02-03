package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialize the WebDriver (ChromeDriver)
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL http://leaftaps.com/opentaps/
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Enter a username and password
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// - Click on the Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click "Find leads." 
		driver.findElement(By.linkText("Find Leads")).click();
	
		//- Click on the "Phone" tab		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//- Enter the phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9842637683");
		
		//. - Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//- Capture the lead ID of the first resulting lead.
		String leadValue = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		System.out.println("Lead Value is"+leadValue);
		Thread.sleep(7000);
		System.out.println("First Resulting Lead");
		//- Click the first resulting lead.
			driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		
		
		System.out.println("Delete Resulting Lead");
		//- Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//- Click "Find leads" again. 
		driver.findElement(By.linkText("Find Leads")).click();
		
		//- Enter the captured lead ID. 
		driver.findElement(By.xpath("//label[contains(text(), 'Lead ID:')]/following::input")).sendKeys(leadValue);
			
		//- Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//- Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion. 
		String noRecordMessage=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (noRecordMessage.equals("No records to display"))
		{
			System.out.println("Record " +leadValue+ "Deleted Successfully");
		}
		
		//- Close the browser.
		driver.close();
		
	}

}