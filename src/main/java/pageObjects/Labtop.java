package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseClassA;

public class Labtop extends baseClassA {
	public Labtop()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------Background and first scenario---------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement HomePageTextValidatinglabtop;
	
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement labtopAndNoteBookTab;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLabTopAndNoteBook;
				//-------------Background locators----------------------------------
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
	private WebElement macBookItemOnlabtopPage;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartMacBookItem;
	
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessageForMacBookLabtop;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userSeeCartMacBook;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userClickOnCartOption;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]/i[1]")
	private WebElement redOptionButtonCart;
	
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userSeeZeroItemONcart;
	//-----------------------------------------------------------------------------------------------
	
	//-----------------Locators for Product Comparison-----------------------------------------------
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement productComparisonMacBook;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement productComparisonMacBookAir;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement successMessageForBothComparison;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	
	@FindBy(xpath = "//strong[contains(text(),'Product Details')]")
	private WebElement productComparisonChart;
	//---------------------------------------------------------------------------------------------------
	
	//----------------Locators For Adding an Item to WishList-------------------------------------------
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement hearIconOnSony;
	
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement sucessMessageWishList;
	//---------------------------------------------------------------------------------------------------
	
	//----------------Locators for Fourth Scenario Validating the price of Mac Book----------------------
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement MacBookProItem;
		
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement priceTagForMacBookPro;
	//---------------------------------------------------------------------------------------------------	
		
	
	//******************************************************************************
	//------------------Background and first scenario methods----------------------
	public void textValidateLabtop()
	{
		String LabtopValidate = HomePageTextValidatinglabtop.getText();
		if(LabtopValidate.equalsIgnoreCase("TEST ENVIRONMENT"))
		{
			logger.info("User is on the right page. ");
		}
		else
		{
			logger.info("user is not on the test envioment.");
		}
		
	}
	
	public void clickOnLabtopAndNoteBook()
	{
		labtopAndNoteBookTab.click();
	}
	
	public void clickOnShowAllLabtopAndNoteBooks()
	{
		showAllLabTopAndNoteBook.click();
	}
				//-------------End of Background Locators----------------------------
	
	public void clickOnMacBookItem()
	{
		macBookItemOnlabtopPage.click();
	}
	
	public void addToCartButtonMacBook()
	{
		addToCartMacBookItem.click();
	}
	
	public void successMessageMacBookLaptop()
	{
		successMessageForMacBookLabtop.getText();
	}
	
	public void verifyUserSeeCartMacBook()
	{
		String MacBookCart = userSeeCartMacBook.getText();
		if(MacBookCart.equalsIgnoreCase("Success: You have added MacBook to your shopping cart!"))
		{
			logger.info("You have successfully add macbook to the cart. ");
		}
		else
		{
			logger.info("sceess meessgae did not match.");
		}
	}
	//------------------------------------
	public void userClickOnCartOption()

	{
		userClickOnCartOption.click();
	}
	
	public void userClickOnRedOptionCart()
	{
		redOptionButtonCart.click();
	}
	
	public void verifyUserSeeNoItemOnCart()
	{
		userSeeZeroItemONcart.getText();
	}
	//---------------------------End of First Scenario-------------------------------------------
	
	//-----------Second Scenario product comparison---------------------------------------------------
	public void clickOnproductCompMacBook()
	{
		productComparisonMacBook.click();
	}
	
	public void clickOnproductCompMacBookAir()
	{
		productComparisonMacBookAir.click();
	}
	
	public void showSuccessMessageForBoth()
	{
		System.out.println(successMessageForBothComparison.getText());
	}
	
	public void clickOnProductComparisonLink()
	{
		productComparisonLink.click();
	}
	
	public void showProductComparisonChart()
	{
		if(productComparisonChart.isDisplayed())
		{
			logger.info("Success Message for product comparison is displayed!!");
		}
		else
		{
			logger.info("Failed No success maessage foudn");
		}
	}
	
	//-------------End of Second scenario-----------------------------------------------------------
	
	//-------------Third Scenario Adding an Item to wish List---------------------------------------
	
	public void clickOnHeartIconWishList()
	{
		hearIconOnSony.click();
	}
	
	public boolean showSuccessMessageWishList()
	{
		if(sucessMessageWishList.isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//--------------End of third Scenario Adding Item to Wish list0----------------------------------
	
	//--------------Fourth Scenario Validating Mac Book Pro price------------------------------------
	
	public void clickOnMacBookProItemPrice()
	{
		MacBookProItem.click();
	}
	
	public void showRightPriceUI()
	{
		priceTagForMacBookPro.isDisplayed();
		priceTagForMacBookPro.getText();
	}
	//----------------End of Last Scenario for Lab top and NoteBook Features---------------------------
	
	
	
}
