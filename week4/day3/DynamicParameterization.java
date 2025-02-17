package week4.day3;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class DynamicParameterization {
	public ChromeOptions options;
	ChromeDriver driver = new ChromeDriver();
	public String filename;
	
	
	@Parameters({"url", "username", "password"})
	
	
		@BeforeMethod             
			public void preCondition(String url, String username, String password) {
		//Create a instance of ChromeOptions class
		options = new ChromeOptions();

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		   driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("Login")).click();
			
		}

		@DataProvider          
		public String[][] sendData() throws IOException {
		return DynamicReadExcel.readData(filename);
			
		}
		
		@AfterMethod            
		public void postCondition() {
			driver.close();
		}

}


