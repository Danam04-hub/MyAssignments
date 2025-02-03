package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		//To click the element
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Switch to the alert 
				Alert promptAlert = driver.switchTo().alert();		
				//Message in the alert box 
				String message = "Selection Text";
				promptAlert.sendKeys(message);
				//Retrieve the typed text from the alert 
				String alertText = promptAlert.getText();                              
			        System.out.println("Text in Prompt Alert Box: "+alertText);
				//System.out.println(promptAlert.getText());                        
				   
				//Dismiss the alert
			        promptAlert.dismiss();                                                
				//promptAlert.accept();                                                 
				//Retrieve the typed text from the alert
				String value = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
				System.out.println(value);
			        //Verify the text using conditional statements 	
				if (value.contains(message))	{
					System.out.println("Text Entered in the Alert");
				}else {						
					System.out.println("Text not Entered");
				}
	}
}
		
		
	





