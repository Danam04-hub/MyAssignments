package week3.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://leafground.com/table.xhtml");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Locate table
        WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
       
        
       //To retrieve a particular value in a table
        WebElement row1Col1Data = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td[1]"));
        
        List<WebElement> allColumns=driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
		int colCount=allColumns.size();
        System.out.println("Column count is"+colCount);
        
       
        
      //To retrieve 1 entire row or 1 entire col data
        List<WebElement> entireCol2Data = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));
        
        
        {
        for (int i = 0; i < entireCol2Data.size(); i++)
        {
            String text =entireCol2Data.get(i).getText();
            System.out.println(text);
            
        }
        
        
            
            
        }
        

        
}	
		


	

}
