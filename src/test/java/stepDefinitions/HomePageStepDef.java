package stepDefinitions;



import java.io.IOException;

import core.baseClassA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObj;
import utilities.utilities;

public class HomePageStepDef extends baseClassA{

	HomePageObj Home = new HomePageObj();
	
	//---------------Background------------------------------------------
	@Given("User is on Retail website home feature")
	public void user_is_on_retail_website_home_features() throws IOException
	{
		Home.homePageValidation();
		logger.info("Title is matching user is in the right website");
		utilities.takeScreenShot();
	}
	
	@When("User click on Currency")
	public void user_clicks_on_currency()
	{
		Home.clickOnCurrencyTab();
		logger.info("User clicked on currency drop down");
	}
	
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_fjorm_deopdown()
	{
		Home.clickOnEuroCurrency();
		logger.info("user has changed currency to euro");
	}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_eiro()
	{
		Home.confirmingChanginCurrency();
		logger.info("Verified User has successfully change currency for website.");
	}
	//------------------End of First scenario------------------------------
	
	//----------------------Second Scenario--------------------------------
	@When("User click on shopping cart home page")
	public void user_click_on_shopping_cart_home_page()
	{
		Home.clickOnShoppingCart();
	}
	
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty()
	{
		Home.sucessMessageEmptySopingCart();
	}
	//-------------------End of second scenario----------------------------
	
}
