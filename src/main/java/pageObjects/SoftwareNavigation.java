package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.baseClassA;

public class SoftwareNavigation extends baseClassA {
	public SoftwareNavigation()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement ContinueButton;
	

}
