package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceStepDefinition  {
public ChromeDriver driver;
	
	@Given("Launch the browser for Salesforce")
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("Load the {string}")
	public void load_the(String url) {
	    driver.get("https://login.salesforce.com/");
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on the toggle")
	public void click_on_the_toggle() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	}

	@When("Click on the View All")
	public void click_on_the_view_all() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}

	@When("Click on Sales")
	public void click_on_sales() throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Account")
	public void click_on_account() {
		WebElement account = driver.findElement(By.xpath("(//span[text()='Accounts'])[1]"));
	    driver.executeScript("arguments[0].click();", account);
	}

	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@When("Enter your name as {string}")
	public void enter_your_name_as(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}

	@When("Select ownership as Public")
	public void select_ownership_as_public() {
		WebElement ownership= driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click();", ownership);
		WebElement status= driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", status);
	}

	@When("Click on Save")
	public void click_on_save() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Verify Account Name")
	public void verify_account_name() {
		boolean alertText = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		  String alertMsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
		  if (alertText) {
		   System.out.println("Success confirmation is succesfully displayed! and the account name is: " + alertMsg);
		  } else {
		   System.out.println("Success confirmation is not displaying");
		  }
		  driver.close();
	}
}


