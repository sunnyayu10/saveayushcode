package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinitions {
		
public static WebDriver driver;
	
	@Given("The user launches the application")
	
	public void The_user_launches_the_application()
	{
		//System.out.println("Opening The Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	@When("Enters the valid UserID and Password")
	public void Enters_the_valid_UserID_and_Password()
	{
		//System.out.println("Enter the user id and password");
		
		WebElement userID = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		
		userID.sendKeys("tomsmith");
		passWord.sendKeys("SuperSecretPassword!");
		
	}
	
	@When("Enters the valid {string} and {string}")
	public void Enters_the_valid_UserIDParameter_and_PasswordParameter(String username, String password)
	{
		//System.out.println("Enter the user id and password");
		
		WebElement userID = driver.findElement(By.id("username"));
		WebElement passWord = driver.findElement(By.id("password"));
		
		userID.sendKeys(username);
		passWord.sendKeys(password);
		
	}

		
	@Then("Clicks on Submit button")
	public void clicks_on_submit_button() {
		
		//System.out.println("Click on Submit");
		
		WebElement SubmitButton = driver.findElement(By.className("radius"));
		SubmitButton.click();
	    
	}
	
	@Then("Check if the user is in Home Page")
	public void check_if_the_user_is_in_home_page() {
		
		System.out.println("Check if the user is in home page");
		
		String HomePageURL = driver.getCurrentUrl();
		
		if(HomePageURL.equalsIgnoreCase("https://the-internet.herokuapp.com/secure"))
		{
			System.out.println("The User is in home page");
		}
		else
		{
			System.out.println("User is not in home page");
		}
	   
	}

	@And("Check the Home Page Title")
	public void check_the_home_page_title() {
		
		System.out.println("The Page title is" +driver.getTitle());
	   
	}
		
		
		@When("Enters the Empty userid and {string}")
		public void enters_the_empty_userid_and(String string) {
			
			WebElement passWord = driver.findElement(By.id("password"));
			passWord.sendKeys(string);
		    
		}

		@Then("Check if the Error message is displayed")
		public void check_if_the_error_message_is_displayed() {
			
			WebElement ErrorMessage = driver.findElement(By.id("flash"));
			
			System.out.println("The error message displayed"+ErrorMessage.getText());
		   
		}
		
		//Scenario Outline Example
		
		@Given("The user launches the applications")
		public void the_user_launches_the_applications() {
		
			System.out.println("Launch the application");
		}
		
		@When("The user enters the userid as {string} and password as {string}")
		public void the_user_enters_the_userid_as_userid_and_password_as_password(String userid, String password) {
			
			System.out.println(userid);
			System.out.println(password);
			
			
		
		}
		@Then("Check the error message")
		public void check_the_error_message() {
		
		}

		
		@And("Close the browser")
		public void close_the_browser() {
		  driver.quit();
		}


	}

