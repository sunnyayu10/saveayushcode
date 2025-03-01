package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbaySearch {

	//public static WebDriver driver;
	
		@Given("The user is on Ebay Home Page")
		public void the_user_is_on_ebay_home_page() {
			
			HookSteps.driver.get("https://www.ebay.com/");
		
		}
		@Then("Verify If the Ebay Page Title is correct")
		public void verify_if_the_ebay_page_title_is_correct() {
			
			String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			String ActualTitle = HookSteps.driver.getTitle();
			
			if(ExpectedTitle.equalsIgnoreCase(ActualTitle))
			{
				System.out.println("Titles are correct");
			}
			else
			{
				System.out.println("Titles are incorrect");
			}
		
		}
		@And("Verify The Ebay Page URL")
		public void verify_the_ebay_page_url() {
			
			String Expected = "https://www.ebay.com/";
			String Actual = HookSteps.driver.getCurrentUrl();
			
			if(Expected.equalsIgnoreCase(Actual))
			{
				System.out.println("URL is correct");
			}
			else
			{
				System.out.println("URL is incorrect");
			}
		
		}
		@And("Check if The Search Text Box is displayed")
		public void check_if_the_search_text_box_is_displayed() {
			
			WebElement SearchBox = HookSteps.driver.findElement(By.xpath("//input[@id='gh-ac']"));
			
			System.out.println(SearchBox.isDisplayed());
		
		}
		@When("The user select any Category")
		public void the_user_select_any_category() {
			
			WebElement Category = HookSteps.driver.findElement(By.xpath("//select[@id='gh-cat']"));
			
			Select s1 = new Select(Category);
			
			s1.selectByValue("267");
			
			
			
		
		}
		@Then("The selected category name should be selected")
		public void the_selected_category_name_should_be_selected() {
			
			
	WebElement Category = HookSteps.driver.findElement(By.xpath("//select[@id='gh-cat']"));
			
			Select s1 = new Select(Category);
			
			s1.selectByValue("267");
			
			WebElement SelectedOption = s1.getFirstSelectedOption();
			
			String selectedText = SelectedOption.getText();
			
			System.out.println(selectedText);
		
		}
		@Then("Click on the Search Icon")
		public void click_on_the_search_icon() {
		
			WebElement SearchIcon = HookSteps.driver.findElement(By.xpath("//input[@id='gh-btn']"));
			
			SearchIcon.click();
			
		}
		@And("Verify if the user is displayed with the Select category label on the Search page")
		public void verify_if_the_user_is_displayed_with_the_select_category_label_on_the_search_page() {
			
			String URLVerifcation = HookSteps.driver.getCurrentUrl();
			
			if(URLVerifcation.contains("Books"))
			{
				System.out.println("Books page is redirected");
			}
			else
			{
				System.out.println("In correct redirection");
			}
			
			WebElement HeadingText = HookSteps.driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
			System.out.println("Heading Text" +HeadingText);
		
		}


}
