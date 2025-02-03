package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		//To click the element
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys("Danam");
		
		//String text = promptAlert.getText();
		//System.out.println(text);
		
		//promptAlert.accept();
		
		//OR
		
		String text = promptAlert.getText();
		System.out.println("Text present inside alert box : "+ text);
		promptAlert.dismiss();
		
		String text1 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("After dismissing the alert box : "+text1);

		//driver.close();
		
		
	}

}



