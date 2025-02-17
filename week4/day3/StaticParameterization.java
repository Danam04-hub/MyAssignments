package week4.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;





public class StaticParameterization {
	ChromeDriver driver;
    ChromeOptions options;
    @Parameters ({"url","username","password"})
	
	@BeforeMethod
    public void preCondition(String Url, String userName, String passWord) {
		
		//ChromeOptions instance to customize Chrome
		options = new ChromeOptions();
		
		//Adding an argument to disable notifications
		options.addArguments("--disable-notifications");
		
		//Initialize ChromeDriver with the ChromeOptions
		driver = new ChromeDriver(options);
		
		//Loading the URL
		driver.get(Url);
		
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//UserName
		driver.findElement(By.id("username")).sendKeys(userName);
		
		//Password
		driver.findElement(By.id("password")).sendKeys(passWord);
		
		//Login button
		driver.findElement(By.id("Login")).click();
		
	}
	
	    @AfterMethod
		public void postCondition() {
		//Close window
		driver.close();
		}

}
	