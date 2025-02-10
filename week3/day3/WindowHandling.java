package week3.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(2000);
			
		driver.manage().window().maximize();
	
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowsadress = driver.getWindowHandles();
		List<String> windowaddresslist = new ArrayList<String>(windowsadress);
		
		driver.switchTo().window(windowaddresslist.get(1));
		String ChildwindowTitle = driver.getTitle();
		System.out.println("Child window Title :"+ ChildwindowTitle);
		
		driver.switchTo().window(windowaddresslist.get(0));
		driver.close();
		
		
		
		
		
		

	}

}
