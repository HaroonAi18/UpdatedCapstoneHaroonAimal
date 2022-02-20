package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import core.baseClassA;

public class utilities extends baseClassA {
	
	//----------------------------------------------------------------------
	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}
	//--------------------------Screen Shot method--------------------------
	public static void takeScreenShot() throws IOException
	{
		String  path = "C:\\Users\\Mharo\\eclipse-workspaceVersion2\\AimalCapstone\\output\\screeenshot";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + file + ".png"));
	}
	//-----------------------------------------------------------------------
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	//------------------Border for an element ----------------------------------------------------
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	//---------------------------------------------------------------------------
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}
	//------------------------------------------------------------------------
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}
	//---------------Scroll to pages down------------------------------------------------------------
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	//------------------------------------------------------------------------------
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}
	//---------------------------------------------------------------------------
	
	
	
	
	
	
}
