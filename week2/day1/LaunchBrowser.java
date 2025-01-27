package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.close();

	}

}
