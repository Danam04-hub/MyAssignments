package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.OutputType;

public class ActionsOnAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		//Loading the URL -get
		driver.get("https://www.amazon.in/n");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     
	    //Search for oneplus 9 pro
	    //Find Element and Enter the Search text 
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
        //Find Element and Select the Search icon
	    driver.findElement(By.id("nav-search-submit-button")).click();
    
	    //Get the price of the first product
	    //System.out.println(driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText());                    
	    String price1 = driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();                         
	    System.out.println("Price of the product: "+price1);
	 
	    //Print the number of customer ratings for the first displayed product
	    driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]")).click();
        //Number of ratings
	    //System.out.println(driver.findElement(By.xpath("(//h2[@id='acr-popover-title']/span)[3]")).getText());
	    String ratings = driver.findElement(By.xpath("(//h2[@id='acr-popover-title']/span)[1]")).getText();
	    System.out.println("Ratings of the product: "+ratings);
  
	    //Click the first text link of the first image
	    driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")).click();
	
	    //Take a screenshot of the product displayed
        //Switch to driver
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String> allwindow = new ArrayList<String>(windowHandles);
	    driver.switchTo().window(allwindow.get(1));
   
        //Screenshot of the product
	    WebElement screenshot = driver.findElement(By.xpath("//li[@class='image item itemNo0 maintain-height selected']"));
	    File source = screenshot.getScreenshotAs(OutputType.FILE);
	    File destination = new File ("./Screenshot/PhoneInAmazon.png");
	    FileUtils.copyFile(source, destination);
   
	    //Click the Add to Cart button
	    driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
   
	    //Get the cart subtototal and Verify if it is correct
	    //System.out.println(driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText());
	    String price2 = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText();
	    System.out.println("Price in cart: "+price2);          
   	    
	    //Close the browser
	    // driver.quit();                                                       
	    driver.close();                                                              
	    driver.switchTo().window(allwindow.get(0));                                  
	    driver.close(); 

	}
	   

	}


