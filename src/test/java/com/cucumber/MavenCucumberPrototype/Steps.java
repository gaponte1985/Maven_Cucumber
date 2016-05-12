/**
 * 
 */
package com.cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Aponte
 *
 */
public class Steps {
	
	@Given("^This is my firts dummy given step$")
	public void This_is_my_firts_dummy_given_step() throws Throwable {
	   System.out.println("This is my firts dummy given step"); 
	}

	@When("^This is my firts dummy when step$")
	public void This_is_my_firts_dummy_when_step() throws Throwable {
		 System.out.println("This is my firts dummy when step"); 
	}

	@Then("^This is my firts dummy then step$")
	public void This_is_my_firts_dummy_then_step() throws Throwable {
		 System.out.println("This is my firts dummy then step"); 
	}


}
