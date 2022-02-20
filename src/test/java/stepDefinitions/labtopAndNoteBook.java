package stepDefinitions;

import core.baseClassA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Labtop;

public class labtopAndNoteBook extends baseClassA {
	
	Labtop LNote = new Labtop();
	
	//-------------Beginning of step definitions for background and first scenario-------------
	@Given("User is on Retail website labtop and notebook")
	public void user_click_on_retail_website_noteBook()
	{
		LNote.textValidateLabtop();
	}
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_labtop_and_noteBook_tab()
	{
		LNote.clickOnLabtopAndNoteBook();
	}
	
	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_labtop_and_notebook()
	{
		LNote.clickOnShowAllLabtopAndNoteBooks();
	}
			//--------------end of step definitions of background-------------------------
	
	//-------------------------------------------------------------------------------------
	
	@And("User click on MacBook item labtop and NoteBook")
	public void user_click_on_MacBook_item_labtop_and_NoteBook()
	{
		LNote.clickOnMacBookItem();
	}
	
	@And("User click add to Cart button labtop and NoteBook features")
	public void user_click_add_to_cart_button_labtop_and_NoteBook_feature()
	{
		LNote.addToCartButtonMacBook();
	}
	
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void success_message_for_mabook_item()
	{
		LNote.successMessageMacBookLaptop();
	}
	//---------
	@And("User should see one items-602.00 showed to the cart")
	public void user_should_see_macbook_added_to_cart()
	{
		LNote.verifyUserSeeCartMacBook();
	}
	
	@And("User click on cart option Labtop and NoteBook features")
	public void user_click_on_cart_option_labtop_and_note_feature()
	{
		LNote.userClickOnCartOption();
	}
	
	@And("user click on red X button to remove the item from cart Labtop and NoteBook")
	public void user_click_on_x_button_to_remove_macBook_from_cart()
	{
		LNote.userClickOnRedOptionCart();
	}
	
	@Then("item should be removed and cart should show No items Labtop features")
	public void item_shoud_be_removed_and_cart_shold_show_zeroItem()
	{
		LNote.verifyUserSeeNoItemOnCart();
	}
	//------------------------End of First Scenario-------------------------------------------
	
	
	//---------------Second Scenario Product comparison Step definitions-----------------------
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_item_macBook()
	{
		LNote.clickOnproductCompMacBook();
	}
	
	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_item_macBookAir()
	{
		LNote.clickOnproductCompMacBookAir();
	}
	
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_shuld_see_message_succes_you_have_add_macBook_macBookAir()
	{
		LNote.showSuccessMessageForBoth();
	}
	
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link()
	{
		LNote.clickOnProductComparisonLink();
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_See_product_comparison_xhart()
	{
		LNote.showProductComparisonChart();
	}
	//-----------------------------------------------------------------------------------------
	
	//--------------------------Third Adding to Wish List scenario------------------------------
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_vaio_to_wish_list()
	{
		LNote.clickOnHeartIconWishList();
	}
	
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_shoudl_get_message_you_must_login_ro_create_accoutn_to_save_sony()
	{
		LNote.showSuccessMessageWishList();
	}
	//---------------------------End of Third Scenario Wish List---------------------------------
	@And("User click on ‘MacBook Pro’ item labtop feature")
	public void click_macBook_pro_item()
	{
		LNote.clickOnMacBookProItemPrice();
	}
	
	@Then("User should see  ‘$2,000.00’ price tag is present on UI.")
	public void user_should_see_price_tag_for_UI_present()
	{
		LNote.showRightPriceUI();
	}
	//--------------------------------------------------------------------------------------------
	

}
