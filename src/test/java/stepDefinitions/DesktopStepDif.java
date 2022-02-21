package stepDefinitions;


import core.baseClassA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopPage;


public class DesktopStepDif extends baseClassA {
	
	DesktopPage deskPageObject = new DesktopPage();
	
	//--------------First Scenario----------------------
	@Given("User is on Retail website")
	public void user_is_on_retail_website ()
	{
		deskPageObject.validateHomePage();
		logger.info("User is on test envioment!!!");
	}
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab()
	{
		deskPageObject.ClickOnDesktopOnNav();
		logger.info("User has click on desktop navigatoin");
	}
	
	
	@And("User click on Show all desktops")
	public void user_Clik_On_show_all_desktops()
	{
		deskPageObject.ClickOnShowAllDesktop();
		logger.info("User has click on show all desktop subitem. ");
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page()
	{
		deskPageObject.confirmAllItemArePresent();
		logger.info("Verified All ithem are presented on the desptop page. ");
	}
	//------------Second Scenario-------------------------------------
	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_HPLP3064_item()
	{
		deskPageObject.AddHPLPtoCart();
		logger.info("User lciked on the cart optioin for HP LP3065");
	}
	
	@And("User select quantity 1")
	public void user_select_quantity1()
	{
		deskPageObject.selectQuantity();
		logger.info("user has selected 1 as quantity for HP labtop. ");
	}
	
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button()
	{
		deskPageObject.addToCartFinal();
		logger.info("verified! user clicked on cart button. ");
	}
			
	@Then("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’")
	public void user_should_see_a_message_success()
	{
		deskPageObject.successMessageHPLP();
		logger.info("Success message has successfully apperead. ");
	}
	//-----------------Third scenario---------------------------------------------
	
	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_for_cannon()
	{
		deskPageObject.addCanonEOS5DtoCart();
		logger.info("User add cannon to cart");
	}
	
	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red()
	{
		deskPageObject.selectCanonColor();
		logger.info("user selected canon color");
	}
	
	@And("User select quantity 1 canon")
	public void user_select_canon_quantity()
	{
		deskPageObject.selectCanonQty();
		logger.info("user seleconted quantity");
	}
	
	@And("User click add to Cart button canon")
	public void user_add_to_cart_button_cannon()
	{
		deskPageObject.canonAddToCartBtn();
		logger.info("user add to cart labtop");
	}
	
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_message_cannon_add_to_shopping_success_message()
	{
		deskPageObject.canonSuccessMessage();
		logger.info("success message on screen");
	}
	//----------------------------------------------------------------------
	
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_d_item()
	{
		deskPageObject.clickOnCanonToAddReview();
		logger.info("user lcik on cannon to add revviowe");
	}
	
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link()
	{
		deskPageObject.clickOnWriteAReview();
		logger.info("user lcik on wriete a revioew link");
	}
	
	@And("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information_review() 
	{
		deskPageObject.inputName();
		deskPageObject.inputReviewBox();
		deskPageObject.inputRating();
		logger.info("Name, reviewo and rating has filled successfullly. ");
	}
	
	@And("User click on Continue Button Review")
	public void user_click_on_continue_buton_add_review()
	{
		deskPageObject.reviewContinueButton();
		logger.info("Verified user hit conityen button ");
	}
	
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.'")
	public void user_should_see_success_message_to_add_revewio_for_cannon()
	{
		
		deskPageObject.thankYouMessageCanon();
		logger.info("Verified result is mathcing. ");
	}
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
}
