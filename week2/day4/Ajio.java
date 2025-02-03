package week2.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL()
		driver.get("https://www.ajio.com/");
		//Maximize the window
		driver.manage().window().maximize();
		//Find and enter element in search
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		//Clicking search
		driver.findElement(By.className("ic-search")).click();
		//Selecting 'Men' under Gender type
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		//Selecting 'Fashion Bags' under Category type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		//Count of items
		String text = driver.findElement(By.className("length")).getText();
		System.out.println("Count of items found:"+text);
				
		//Get the list of brand of the products
		List<WebElement> brandsName = driver.findElements(By.className("brand"));
				
		int numOfBrands = brandsName.size();
		System.out.println("Number of results:"+numOfBrands);
				
		List<String> allBrandsName = new ArrayList<String>();
		System.out.println("Brand of bags:");
				
		for(int i =0 ; i<numOfBrands; i++) {
		String brand = brandsName.get(i).getText();
		allBrandsName.add(brand);
		System.out.println(brand);
				}
				
		//Get the list of name of bags
		List<WebElement> listOfBags = driver.findElements(By.className("nameCls"));
				
		List<String> allBagNames = new ArrayList<String>();
		System.out.println("Name of Bags: ");
				
		for (int j=0; j<numOfBrands; j++) {
		String nameOfBags = listOfBags.get(j).getText();
		allBagNames.add(nameOfBags);
		System.out.println(nameOfBags);
				}
				
		//Close Browser
		//driver.close();
			

	}

}
