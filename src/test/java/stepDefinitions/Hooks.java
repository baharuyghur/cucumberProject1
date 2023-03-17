package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {
	
	
	@Before
	public void setUp(){
		System.out.println("############ Test Started ##############");
		Driver.getDriver();	
	}
	@After
	public void tearDown() {
		System.out.println("############ Test Ended ##############");
	Driver.closeDriver();
	}

}
