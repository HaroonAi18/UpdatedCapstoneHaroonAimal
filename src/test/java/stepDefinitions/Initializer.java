package stepDefinitions;

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
	
	
	
	
	@After
	public void afterHooks(Scenario scenario) 
	{
		tearDown();
		logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
	}

}
