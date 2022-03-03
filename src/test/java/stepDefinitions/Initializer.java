package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import core.baseClassA;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends baseClassA {
	
	@Before
	public void beforeHooks(Scenario scenario) 
	{
		logger.info("Scenario "+ scenario.getName() + " Started");
		browser(); 
		openBrowser(); 
	}
	
	
	//Method to generate report in html web page.
	@Before
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Project Automation Generatted by Haroon");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Haroon AImal");
		extent.createTest("Generated Reports");
		extent.flush();
		
	}
	
	
	
	
	@After
	public void afterHooks(Scenario scenario) 
	{
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
	}

}
