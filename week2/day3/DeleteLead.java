package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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


		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the Phone tab
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//Enter the phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("8072292579");
		//Click the Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Capture the lead ID of the first resulting lead
		//Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		//Click the first resulting lead
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		
		//Click the Delete button
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		//Click Find leads again
		driver.findElement(By.linkText("Find Leads")).click();
	    CharSequence text1 = null;
		//Enter the captured lead ID
		driver.findElement(By.xpath("//label[contains(text(), 'Lead ID:')]/following::input")).sendKeys(text1);
		//Click the Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		//Verify the presence of the message "No records to display" in the Lead list. This is the message confirms the successful deletion.
		Thread.sleep(5000);
		boolean isMessageVisible = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		System.out.println("Is the message visible? " + isMessageVisible);
		          
		//Close the browser
		driver.close();
		
	}

}
