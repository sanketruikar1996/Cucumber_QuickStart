package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Im on Login Page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Im Entering username and password");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Im clicking on login Button...");
	}

	@Then("user gets navigated to home page")
	public void user_gets_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Im on Home page");
	}
}
