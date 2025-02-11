package week3.day4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTableInteraction {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
				
		//Load the URL (https://erail.in/) 
		driver.get("https://erail.in/");
			
		//Maximize the browser window 
		driver.manage().window().maximize();

		//Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		//Enter "MAS" as the "From" station. 
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']")).click();
				
		//Enter "MDU" as the "To" station. 
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
				
		//Uncheck the "Sort on Date" checkbox.
		driver.findElement(By.id("chkSelectDateOnly")).click();
				
		//Retrieve the train names from the web table. 
		//Locate the WebTable
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
		System.out.println("Table Located");
				
		//To count the number of rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		int rowCount = allRows.size();
		System.out.println("Row count is: "+rowCount);
				
		//Get the train name column
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		List<String> trainNameList=new ArrayList<String>();
		for(int i=0;i<trainNames.size();i++)
				{
					trainNameList.add(trainNames.get(i).getText());
				}
				System.out.println("Train Name Column: "+trainNameList);
				
		//Verify if there are any duplicate train names in the web table. 
		//Set<String> uniqueTrains=new HashSet<>(trainNameList);
		Set<String> uniqueTrains = new HashSet<>(trainNameList);
		System.out.println("Train Name List");
		for (String trains : uniqueTrains) {
		System.out.println(trains);

	}
	}

}
