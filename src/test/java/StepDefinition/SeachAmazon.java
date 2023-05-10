package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeachAmazon {
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    
	}

	@When("I search for product with name {string} and Price {int}")
	public void i_search_for_product_with_name_and_price(String string, Integer int1) {
	    
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
	    
	}
	

    @Then("Order id is {int} and username is {string}")
    public void order_id_is_and_username_is(Integer int1, String string) {
   
     }
}
