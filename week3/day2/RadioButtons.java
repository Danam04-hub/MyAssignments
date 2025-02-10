package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.leafground.com/radio.xhtml");
		//Implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons 
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		System.out.println("Button Selected: "+selected);
		
		//Identify the radio button that is initially selected by default.
		 WebElement chrome = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:0'])"));
		 boolean selected1 = chrome.isSelected();
		 WebElement firefox = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:1'])"));
		 boolean selected2 = firefox.isSelected();
		 WebElement safari = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:2'])"));
		 boolean selected3 = safari.isSelected();
		 WebElement edge = driver.findElement(By.xpath("(//input[@id='j_idt87:console2:3'])"));
		 boolean selected4 = edge.isSelected();
			
		if (chrome.isSelected()) {
			System.out.println("Chrome: "+selected1);}
		else if  (firefox.isSelected()){
				System.out.println("Firefox: "+selected2);}
		else if  (safari.isSelected()){                                          
					System.out.println("Safari: "+selected3);}
		else if  (edge.isSelected()){
						System.out.println("Edge: "+selected4);
			}else {
			System.out.println("No button is selected by default");
		}
		
		//Check and select the age group (21-40 Years) if not already selected.
		WebElement ageGroup = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		boolean age= ageGroup.isSelected();
		if (age==false) {
		ageGroup.click();
		
	}	
		else {
		System.out.println("(21-40 Years) already selected");
	}
	
		//Close the browser
		driver.close();
		

	}

}
