package stepDefinitions;

import java.io.IOException;

import core.baseClassA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.retailPage;
import utilities.utilities;

public class RetailPageStepDef extends baseClassA {

	retailPage rePage = new retailPage();
	
	//----------------------Background Information-------------------------------
	@Given("User is on Retail website login")
	public void user_is_on_retail_websiete_login()
	{
		rePage.validateMainPage();
	}
	
	@And("User click  on MyAccount retail")
	public void user_click_on_myaccount_retail()
	{
		rePage.clickOnMyAccount();
		logger.info("user lcik on my account");
	}
	
	@When("User click on Login retial")
	public void user_click_on_longin_retail()
	{
		rePage.clickOnLogInRetailFeatureFirstLogin();
		logger.info("user clicked on login retail page");
	}
	
	@And("User enter username ‘userName’ and password 'password’")
	public void enter_username_and_passowrd()
	{
		rePage.enterUsername();
		rePage.enterPassword();
		logger.info("Verified user successfully entered username and password");
	}
	
	@And("User click on Login button retail feature")
	public void user_click_on_longin_button()
	{
		rePage.clickLogInButton();
		logger.info("user lcike on login button");
	}
	
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_loggeed_to_dashborad() throws IOException
	{
		rePage.confirmLogInToDashboard();
		logger.info("Verified!");
		utilities.takeScreenShot("dashboard");
	}
	//------------------End of BackGround information login to my account---------------
	
	//-------------------First Scenario Step Definition----------------------------------
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affliate_acoutn()
	{
		rePage.clickOnRegisterAffliateAccount();
	}
	
	@And("User fill affiliate form with below information")
	public void userFillAffliateForm()
	{
		rePage.enterCompanyName();
		rePage.enterWebsite();
		rePage.enterTaxID();
		rePage.selectChequeMethod();
		rePage.enterNameOnCheck();
	}
	
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box()
	{
		rePage.clickOnAboutUsCheckBox();
	}
	
	@And("User click on Continue button retail first")
	public void user_click_on_continue_button_retail_first()
	{
		rePage.clcikContinueButtonRetail();
	}
	
	@Then("User should see a success message retail")
	public void user_should_see_a_secces_meessage_reail() throws IOException
	{
		rePage.showSuccessMessageAffliateUser();
		utilities.takeScreenShot("retail");
	}
	
	//--------------------End of First Scenario step definition------------------------
	
	//--------------------Second Edit Affliate account---------------------------------------
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_eidt_your_affliate_information()
	{
		rePage.clickOnYourEditAffliatedInformationLink();
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button()
	{
		rePage.clickOnBankTransferRadioBUtton();
	}
	
	@And("User fill Bank information with below information retail page")
	public void user_fill_bank_information_with_below_informaiton()
	{
		rePage.enterBankName();
		rePage.enterABANumber();
		rePage.enterSwiftCode();
		rePage.enterBankAccountName();
		rePage.enterBankAccountNumber();
	}
	
	@And("User click on Continue button retail page third scene")
	public void user_click_on_contineu_button_retail()
	{
		rePage.clcikContinueThirdScenario();
	}
	
	@Then("User should see a success message retail third")
	public void user_should_see_a_seccess_message_retail_third()
	{
		rePage.showSuccessMessageThirdScenario();
	}
	//---------------------End of Edit your Affliate account-----------------------------------
	
	//---------------------Last scenario edit your account------------------------------------
	@When("User click on ‘Edit your account information’ link")
	public void user_Click_on_eidt_your_account_infomraino()
	{
		rePage.clickEditMyAccountLink();
	}
	
	@And("User modify below information thrid scenario retail")
	public void user_modify_the_follwoing_informaitno()
	{
		rePage.modifyFirstName();
		rePage.modifyLastName();
		rePage.modifyEmail();
		rePage.modifyTelephone();
	}
	
	@And("User click on continue button reail featreu")
	public void user_click_on_continue_button_retail()
	{
		rePage.clickContinueBUttonFourhtScenario();
	}
	
	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_shoud_see_success_message_fourht_scenario_retail() throws IOException
	{
		rePage.showSucessMessageFourthScenario();
		utilities.takeScreenShot("messagesceess");
	}
	
	//---------------------------------------------------------------
	
	
	
	
}
