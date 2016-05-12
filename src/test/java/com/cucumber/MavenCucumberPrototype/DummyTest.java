package com.cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DummyTest {
	@Given("^I navigate to a site$")
	public void I_navigate_to_a_site() throws Throwable {
		 System.out.println("I navigate to a site"); 
	}

	@When("^I click on a button$")
	public void I_click_on_a_button() throws Throwable {
		 System.out.println("I click on a button"); 
	}

	@Then("^I check I am on the correct page$")
	public void I_check_I_am_on_the_correct_page() throws Throwable {
		 System.out.println("I check I am on the correct page"); 
	}
}
