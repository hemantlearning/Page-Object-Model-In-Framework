package pages_Methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages_UI.Home_Page;
import pages_UI.Men_Topwear;
import project_Base.Base_Class;

public class MensTopwear_Methods extends Base_Class
{
	long startTime;
	long endTime;
	
	WebElement MenuOption = null;
	public void ChooseMenu(String Menu) {
		//openMenu_Men();
		Men_Topwear page = new Men_Topwear(driver);
		if(Menu.equals("Offer")) {
			MenuOption = Men_Topwear.Offer;
		}else if(Menu.equals("BigDeals")) {
			MenuOption = Men_Topwear.BigDeals;
		}else if(Menu.equals("IndianWear")) {
			MenuOption = Men_Topwear.IndianWear;
		}else if(Menu.equals("SportsWear")) {
			MenuOption = Men_Topwear.SportsWear;
		}else if(Menu.equals("OriginalStamp")) {
			MenuOption = Men_Topwear.OriginalStamp;
		}else if(Menu.equals("SearchBar")) {
			MenuOption = Men_Topwear.SearchBar1;
		}
	}
	
	public boolean checkMenuIsDisplayed(String Menu){
		ChooseMenu(Menu);
		if (MenuOption == null) {
			return false;
		}else if(MenuOption.isDisplayed()) {
			return true;
		}else
			return false;
	}

	public void clickMenu(String Menu) {
		if(checkMenuIsDisplayed(Menu)) {
		MenuOption.click();
		}
		else
			System.out.println("Menu is not displayed, so we cannot perform click operation");
	}
	
	public void ClickSearchBar() {
		WebElement element = Men_Topwear.SearchBar1;
		element.click();
	}
	
	public void ClearSearchBar() {
		WebElement element = Men_Topwear.SearchBar1;
	}
	
	public void SearchProduct(String ProductName) {
		WebElement element = Men_Topwear.SearchBar1;
		element.sendKeys(ProductName);
		element.sendKeys(Keys.ENTER);
	}
	
	public void startTimer() {
		startTime = System.currentTimeMillis();
		
	}
	
	public void endTimer() {
		endTime = System.currentTimeMillis();
		
	}
	
	public void totalTime() {
		long totaltimetaken = endTime - startTime;
		System.out.println("Total Time taken by this test is : "+totaltimetaken);
		
	}
	
	

	public void openMenu_Men()  {
		Actions a = new Actions(driver);
		a.moveToElement(Home_Page.MenuOption_Men(driver));
		a.click().build().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
