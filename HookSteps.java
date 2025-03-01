package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookSteps {

	public static WebDriver driver;

	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	@BeforeStep

	public void beforeStep()
	{
		System.out.println("-------Invoking Before Step Hook-------");
	}


	/*@Given("The user is on amazon Home Page")
	public void The_user_is_on_amazon_Home_Page() {
		driver.get("https://www.amazon.in/");

	}

	@When("The User searches for any search key term")
	public void the_user_searches_for_any_search_key_term() {

		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("Shirts");
	}

	@Then("Verify if the search icon is displayed")
	public void verify_if_the_search_icon_is_displayed() {

		WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		if (SearchIcon.isDisplayed()) {
			System.out.println("Search Icon is Displayed");
		} else {
			System.out.println("Search Icon is not displayed");
		}
	}

	@Then("Click on Search icon")
	public void click_on_search_icon() {

		WebElement SearchIcon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

		SearchIcon.click();
	}

	@And("Check if the user is in Search Results page")
	public void check_if_the_user_is_in_search_results_page() {
	}

	@Then("Verify if the home page is displayed")
	public void verify_if_the_home_page_is_displayed() {
	}*/
	
	@AfterStep

	public void Afterstep()
	{
		System.out.println("----------Executing After Step------");
	}

	@After
	public void close() {
		driver.quit();
	}

}
