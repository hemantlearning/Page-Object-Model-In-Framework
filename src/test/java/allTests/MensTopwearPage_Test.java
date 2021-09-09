package allTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages_Methods.MensTopwear_Methods;
import pages_Methods.MensTopwear_Methods2;
import project_Base.Base_Class;

public class MensTopwearPage_Test {
  
	@BeforeMethod
	public void launchApplication() {
		Base_Class.Initialization();
	}
	

	public void Test1() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("Offer");
		Assert.assertTrue(checkStatus);
	}
	

	public void Test2() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("BigDeals");
		Assert.assertTrue(checkStatus);
	}
	

	public void Test3() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("IndianWear");
		Assert.assertTrue(checkStatus);
	}
	

	public void Test4() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("SportsWear");
		Assert.assertTrue(checkStatus);
	}
	

	public void Test5() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		boolean checkStatus = methods.checkMenuIsDisplayed("OriginalStamp");
		Assert.assertTrue(checkStatus);
	}
	
	@Test
	public void Test6() {
		MensTopwear_Methods methods = new MensTopwear_Methods();
		methods.startTimer();
		boolean checkStatus = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus);
		
		boolean checkStatus1 = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus1);
		
		boolean checkStatus2 = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus2);
		
		methods.endTimer();
		methods.totalTime();
	}
	
	@Test
	public void Test7() {
		System.out.println("With CacheLookup");
		MensTopwear_Methods2 methods = new MensTopwear_Methods2();
		methods.startTimer();
		boolean checkStatus = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus);
		
		boolean checkStatus1 = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus1);
		
		boolean checkStatus2 = methods.checkMenuIsDisplayed("SearchBar");
		methods.ClearSearchBar();
		methods.ClickSearchBar();
		methods.SearchProduct("SportsWear");
		Assert.assertTrue(checkStatus2);
		
		methods.endTimer();
		methods.totalTime();
	}
	
	
	
	
	@AfterMethod
	public void closeApplication() {
		Base_Class.tearDownTest();
	}

	
}
