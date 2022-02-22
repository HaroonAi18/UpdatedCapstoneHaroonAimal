package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.baseClassA;

public class HomePageObj extends baseClassA {
	
	public HomePageObj()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------------------Background---------------------------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement textToValidateHome;
	
	//--------------------First Scenario select currency-------------------------------------------------
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currencyButton;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroCurrencyFromDropDown;
	
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroSelected;
	//---------------------End of locators for first scenario---------------------------------------------
	
	//---------------------Locators for second scenario checking empty shopping cart----------------------
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement emptyingShopingCart;
	
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyShoppingCartMessage;
	
	//****************************************************************************************************
	//****************************************************************************************************
	
	//-------------------Background------------------------------------------------------------------------
	public void homePageValidation()
	{
		String text = textToValidateHome.getText();
		if(text.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("Verified! User is in the correct webste");
		}
		else
		{
			logger.info("Failed! User is in the wrong website");
		}
	}
	//----------------------First scenario----------------------------------------------------------------------
	public void clickOnCurrencyTab()
	{
		currencyButton.click();
	}
	
	public void clickOnEuroCurrency()
	{
		euroCurrencyFromDropDown.click();
	}
	
	public void confirmingChanginCurrency()
	{
		/*String confirmCurrency = euroSelected.getText();
		String euro = "$";
		Assert.assertEquals(euro, confirmCurrency);*/
		
	}
	
	//--------------End of Methods for first Scenario---------------------------------------------------------
	//--------------Second Scenario Methods checking empty cart-----------------------------------------------
	public void clickOnShoppingCart()
	{
		emptyingShopingCart.click();
	}
	
	public void sucessMessageEmptySopingCart()
	{
		String emptyCart = emptyShoppingCartMessage.getText();
		if(emptyCart.equalsIgnoreCase("0 items"))
		{
			logger.info("successed cart is empty now");
		}
		else
		{
			logger.info("Cart is still loaded. ");
		}
	}
	//------------End of scecond Scenario checking empty shooping cart----------------------------------------
	
	
	
	
	
	
}
