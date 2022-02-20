package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseClassA;

public class DesktopPage extends baseClassA{
	
	public DesktopPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------firsct scenrairo locators---------------------------
		@FindBy(xpath = "//a[contains(text(),'TEST ENVIRONMENT')]")
		private WebElement HomePageTextValidating;
		
		@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
		private WebElement DesktopLink;
		
		@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
		private WebElement showAllDesktop;
		
		@FindBy(tagName = "a")
		private List <WebElement> deskTopUIElementWithAtag;
		
		@FindBy(xpath = "//div[contains(text(),'Showing 1 to 12 of 12 (1 Pages)')]")
		private WebElement showingAllItemsText;
		
		@FindBy(id = "list-view")
		private WebElement ListView;
		
		@FindBy(id = "grid-view")
		private WebElement GridView;
	//-----------------------------------------------------------------
		//---------------Adding HP LP3065 to the cart Web Elements locators---------
		
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
		private WebElement AddHPLP3065toCart;
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement HPQtyBox;
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement HPAddtoCartFinal;
		
		@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
		private WebElement successMessageHPLaptop;
		//-----------------------------------------------------------------------------
		//---------------Adding Cannon EOS 5D to Cart Scenario------------------------
		
		@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
		private WebElement AddCannonEOSToCart;
		
		@FindBy(xpath = "//select[@id='input-option226']")
		private WebElement colorDropDown;
		
		@FindBy(xpath = "//option[contains(text(),'Red')]")
		private WebElement redCanon;
		
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement CannonQty;
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addToCartButn;
		
		@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
		private WebElement successMessageCanon;
		//----------------------------------------------------------------------------
		//--------------------Review to Cannon Camera---------------------
		@FindBy(xpath = "//a[contains(text(),'Canon EOS 5D Camera')]")
		private WebElement clickOnCannonToAddReview;
		
		@FindBy(xpath = "//a[contains(text(),'Write a review')]")
		private WebElement WriteAReview;
		
		@FindBy(xpath = "//input[@id='input-name']")
		private WebElement InputNameReview;
		
		@FindBy(xpath = "//textarea[@id='input-review']")
		private WebElement writeReviewBox;
		
		@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/label")
		private WebElement ratingHeader;
		
		@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[1]")
		private WebElement rating1;
		
		@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[2]")
		private WebElement rating2;
		
		@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[3]")
		private WebElement rating3;
		
		@FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[4]")
		private WebElement rating4;
		
		@FindBy(xpath = "//*[@id=\'form-review\']/div[4]/div/input[5]")
		private WebElement rating5;
		
		@FindBy(xpath = "//button[@id='button-review']")
		private WebElement ContinueBtn;
		
		@FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
		private WebElement thankYouMessageReview;
		
		
		//------------------------------------------------------------------------------------	
	
		
		
		
		
	//********************************************************************************
		
	//-------------------First scenario-----------------------------------------------
		public void validateHomePage()
		{
			String text = HomePageTextValidating.getText();
			if(text.equalsIgnoreCase("TEST ENVIRONMENT"))
			{
				logger.info("Validated User in on Test Envionment");
			}
			else
			{
				logger.info("User isn not in test envioment.");
			}
		}
		
		public void ClickOnDesktopOnNav()
		{
			DesktopLink.click();
		}
		
		public void ClickOnShowAllDesktop()
		{
			showAllDesktop.click();
		}
		
		//Confirming Elements in Desktop page.
		public boolean confirmAllItemArePresent()
		{
			if(showingAllItemsText.isDisplayed())
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		
	//------------------------------------------------------------------
		//---------------Second Scenario adding HPLP to cart-----------------------
		
		public void AddHPLPtoCart()
		{
			AddHPLP3065toCart.click();
		}
		//----------Debug-----------------------
		public void selectQuantity()
		{
			
			HPQtyBox.sendKeys("1");
		}
		
		public void addToCartFinal()
		{
			HPAddtoCartFinal.click();
		}
		//------------Debug---------------------
		public void successMessageHPLP()
		{	
			String DesktopVerify = successMessageHPLaptop.getText();
			if(DesktopVerify.equalsIgnoreCase("successMessageHPLaptop.getText();"))
			{
				logger.info("Verified the text is matching");
			}
			else
			{
				logger.info("Failed! text is not mathcin test cases requiremnt");
			}
			
			
		}
		
		//--------------------------------------------------------------------------------
		//---------------Third Scenario Adding Cannon EOP to Cart--------------------
		public void addCanonEOS5DtoCart()
		{
			AddCannonEOSToCart.click();
		}
		
		public void selectCanonColor()
		{
			colorDropDown.click();
			redCanon.click();
		}
		
		public void selectCanonQty()
		{
			CannonQty.click();
		}
		
		public void canonAddToCartBtn()
		{
			addToCartButn.click();
		}
		
		public void canonSuccessMessage()
		{
			String thirdScenario = successMessageCanon.getText();
			if(thirdScenario.equalsIgnoreCase("Success: You have added Canon EOS 5D Camera to your shopping cart!"))
			{
				logger.info("Sucess Message displayed user can see the text message");
			}
			else
			{
				logger.info("Failed the success message is not matching.");
			}
			
		}
		//--------------End of Third Scenario------------------------------------------
		//--------------Last Adding A Review to Canon Camera--------------------------
		public void clickOnCanonToAddReview()
		{
			clickOnCannonToAddReview.click();
		}
		
		public void clickOnWriteAReview()
		{
			WriteAReview.click();
		}
		
		public void inputName()
		{
			InputNameReview.sendKeys("Haroon Emran");
		}
		
		public void inputReviewBox()
		{
			writeReviewBox.sendKeys("Canon Camera is the best Camera of All time. I bought one years ago and it is still rocking");
		}
		
		public void inputRating()
		{
			rating3.click();
		}
		
		public void reviewContinueButton()
		{
			ContinueBtn.click();
		}
		
		public void thankYouMessageCanon()
		{
			String successMessage = thankYouMessageReview.getText();
			if(successMessage.equalsIgnoreCase(" Thank you for your review. It has been submitted to the webmaster for approval."))
			{
				logger.info("Verified! Thank You message has Appeared. ");
			}
			else
			{
				logger.info("Failed to show thank You message");
			}
			
		}
		//--------------------End of Last Scenario adding a Review----------------------
		
		
		
		
}
