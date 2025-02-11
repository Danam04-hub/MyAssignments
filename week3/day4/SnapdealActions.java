package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SnapdealActions {

			public static void main(String[] args) throws InterruptedException, IOException { 
				//Initialize ChromeDriver 
				 ChromeDriver driver=new ChromeDriver();
				//Load the URL (https://www.snapdeal.com/) 
				driver.get("https://www.snapdeal.com/");
				//Maximize the browser window 
				driver.manage().window().maximize();
				//Add an implicit wait to ensure the webpage elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.navigate().refresh();
				
				//Go to "Men's Fashion".
				Actions a=new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).perform();
				
				//Go to "Sports Shoes".
				a.moveToElement(driver.findElement(By.xpath("(//span[@class='linkTest'])[1]"))).click().perform();
				
				//Get the count of sports shoes.
				String shoeCount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[1]")).getText();
				System.out.println("Total Count of Sports Shoes:"+shoeCount);
				
				//Click on "Training Shoes".
				driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
				
				//Sort the products by "Low to High". 
				driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
				driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
				
				//Check if the displayed items are sorted correctly. 
				//WebElement lowtoHighList = driver.findElement(By.xpath("//span[@class='lfloat product-price']"));
				List<WebElement> lowtoHighList = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
				System.out.println(lowtoHighList.size());
				List<Integer> priceList=new ArrayList<Integer>();
				for(int i=0;i<lowtoHighList.size();i++)
				{
					//priceList.add(Integer.parseInt(lowtoHighList.get(i).getAttribute("data-price")));
					priceList.add(Integer.parseInt(lowtoHighList.get(i).getAttribute("data-price")));
				}
				System.out.println("List Before Sorting:"+priceList);
				Collections.sort(priceList);
				System.out.println("List After Sorting:"+priceList);
				
				//Select any price range ex:(500-700).
				WebElement fromValue = driver.findElement(By.xpath("//input[@name='fromVal']"));
				a.moveToElement(fromValue).perform();
				fromValue.clear();
				a.click(fromValue).sendKeys("500");
				
				WebElement toValue = driver.findElement(By.xpath("//input[@name='toVal']"));
				a.moveToElement(toValue).perform();
				toValue.clear();
				/*a.click(toValue).sendKeys("700");
				driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
				
				driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
				driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
				*/
				driver.findElement(By.xpath("//input[@name='toVal']")).clear();
				driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
				
				driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
				
				//Filter by any colour. 
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement colorElement = driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']//a[text()=' White & Blue']"));
				WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(colorElement));
				a.moveToElement(clickableElement).click().perform();
				Thread.sleep(3000);
				
				//Verify all the applied filters. 
				
				
				//Mouse hover on the first resulting "Training Shoes".
				WebElement elementFirstShoe = driver.findElement(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
				a.moveToElement(elementFirstShoe).perform();
				
				//Click the "Quick View" button.
				driver.findElement(By.xpath("//div[contains(text(),'Quick View')][1]")).click();
				
				//Print the cost and the discount percentage. 
				String shoeCost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
				System.out.println("Shoe Price is:"+shoeCost);
				String dicountPercentage = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
				System.out.println("Discount Percentage is:"+dicountPercentage);
				
				
				//Take a snapshot of the shoes.
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File destination = new File("./Screenshot/ShoeScreenShot.png");
				FileUtils.copyFile(screenshot, destination);	
						
				//Close the current window.
				driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
				
				//Close the main window.
				driver.close();

	}

}
