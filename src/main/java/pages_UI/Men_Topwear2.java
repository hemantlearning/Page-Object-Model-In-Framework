package pages_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men_Topwear2 
{
	protected WebDriver driver;
	/**
	 * We will be using Page Factory for Storing WebElements
	 * 1. Define protected WebDriver
	 * 1. Define public static WebElements by using @FindBy annotation
	 * 2. Initialize all the WebElements in constructor
	 */
	
	
	@FindBy(xpath="//p[contains(text(),'FLAT ₹400 OFF')]") 
	public static WebElement Offer;
	
	@FindBy(xpath="//h4[contains(text(),'Biggest Deals On Top Brands')]") public static WebElement BigDeals;
	
	@FindBy(xpath="//h4[contains(text(),'Trending In Indian Wear')]") public static WebElement IndianWear;
	
	@FindBy(xpath="//h4[contains(text(),'Trending In Sports Wear')]") public static WebElement SportsWear;
	
	@FindBy(xpath="//h4[contains(text(),'100% ORIGINAL ')]") public static WebElement OriginalStamp;
	
	@FindBy(xpath="//input[@class='desktop-searchBar']") 
	@CacheLookup
	public static WebElement SearchBar; 
	
	
	
	public Men_Topwear2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
