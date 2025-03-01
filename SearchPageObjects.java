package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObjects {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='gh-ac']")
	public static WebElement SearchBox;
	
	@FindBy(xpath="//select[@id='gh-cat']")
	public static WebElement Category;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement SearchIcon;
	
	@FindBy(xpath="//span[@class='b-pageheader__text']")
	public WebElement SearchHeadingText;
	
	public SearchPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//PageFactory.initElements(driver, driver);
	}
	
}
