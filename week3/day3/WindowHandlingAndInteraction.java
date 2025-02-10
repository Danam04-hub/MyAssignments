package week3.day3;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndInteraction {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		 
		//Loading the URL -get
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     
	     //sendKeys - To enter data in text field
	     //Enter the username  -findElement
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     
	     //Enter the password
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     //Login Button	  
		  driver.findElement(By.className("decorativeSubmit")).click();
		  //CRM/SFA link
		  driver.findElement(By.linkText("CRM/SFA")).click(); 
		  //Click on Contacts button
		  driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]/a")).click();
		  //Click on Merge Contacts
		  driver.findElement(By.linkText("Merge Contacts")).click();
		  //Click on the widget of the "From Contact"
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
		  //Click on the first resulting contact
		  //Get all window address into set
		  Set<String> windowHandles1 = driver.getWindowHandles();
		  //Empty list and add the set element into list
		  List<String> allWindows1 = new ArrayList<String>(windowHandles1 );
		  //Switch the focus into new window (From Contact)
		  driver.switchTo().window(allWindows1.get(1));
		  //First resulting contact
		  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		  //Click on the widget of the "To Contact"
		  //Switch the focus into parent window
		  driver.switchTo().window(allWindows1.get(0));
		  //Widget of the To Contact
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
		  //Click on the second resulting contact
		  //Get all window address into set
		  Set<String> windowHandles2 = driver.getWindowHandles();
	      //Empty list and add the set element into list
		  List<String> allWindows2 = new ArrayList<String>(windowHandles2);
		  //Switch the focus into new window (To Contact)
		  driver.switchTo().window(allWindows2.get(1));
		  //Second resulting contact
		  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		  //Click on the Merge button
		  //Switch the focus into parent window
		  driver.switchTo().window(allWindows1.get(0));
		  //Merge button
		  driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[3]")).click();
		  //Accept the alert
		  //Switch the driver to alert
		  Alert alert = driver.switchTo().alert();
		  //Click OK
		  alert.accept();
		  //Verify the title of the page
		  System.out.println(driver.getTitle());
		  
		  //Close the browser
		  driver.quit();
	     
	    
		
	}

}
