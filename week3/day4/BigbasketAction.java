package week3.day4;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigbasketAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Initialize ChromeDriver 
	    ChromeDriver driver=new ChromeDriver();
	    //Load the URL
		driver.get("https://www.bigbasket.com/");
		// Maximize the browser window
		driver.manage().window().maximize();
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Shop by Category
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		
		//Mouse over Foodgrains, Oil & Masala
		Thread.sleep(1000);
		Actions mousehover1 = new Actions(driver);
		WebElement foodOilMas = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		mousehover1.moveToElement(foodOilMas).perform();
		     
		//Mouse over Rice & Rice Products
		Actions mousehover2 = new Actions(driver);
		WebElement  riceProd= driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		mousehover2.moveToElement(riceProd).perform();
		
		//Click on Boiled & Steam Rice
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		//Filter the results by selecting the brand bb Royal
		//Scroll
		Actions scrollFilter = new Actions(driver);
		WebElement scrollElement1 = driver.findElement(By.id("i-BBRoyal"));
		scrollFilter.scrollToElement(scrollElement1).perform();
		scrollElement1.click();
		
		//Click on Tamil Ponni Boiled Rice
		//Scroll
		Thread.sleep(1000);
		Actions scrollProduct = new Actions(driver);
		WebElement scrollElement2 = driver.findElement(By.xpath("//div[@class='break-words h-10 w-full']/h3[text()='Tamil Ponni Boiled - Rice']"));
		scrollProduct.scrollToElement(scrollElement2).perform();
		scrollElement2.click();

		//Switch the browser
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allWindows.get(1));
		
		//Select the 5 kg bag
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='flex justify-start w-full h-full'])[2]//span[text()='5 kg']")).click();
		//Check and note the price of the rice
		String ricePrice = driver.findElement(By.xpath("//table/tr[2]/td[1]")).getText();
		System.out.println("Price of the rice: "+ricePrice);
		//Click Add to add the bag to you cart
		driver.findElement(By.xpath("//button[text()='Add to basket'][1]")).click();
		//Verify the success message that confirms the item was added to your cart
		Thread.sleep(1000);
		String successMsg = driver.findElement(By.xpath("//div[@class='Toast___StyledDiv-sc-1uergwq-0 kLrmgR']/p")).getText();
		System.out.println("Success Message: "+successMsg);
		//Take a snapshot of the current page
		 File source = driver.getScreenshotAs(OutputType.FILE);
		 File destination = new File ("./Screenshot/BigbasketPage.png");
		 FileUtils.copyFile(source, destination);
		
		//Close the current window
		driver.close();
		//Close the main window
		driver.switchTo().window(allWindows.get(0));
		driver.close();


	}

}
