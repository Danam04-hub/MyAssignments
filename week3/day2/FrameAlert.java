package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	System.out.println(driver.findElement(By.id("demo")).getText());
	

	

	}

}
