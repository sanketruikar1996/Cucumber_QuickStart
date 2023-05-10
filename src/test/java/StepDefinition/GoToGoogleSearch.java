package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoToGoogleSearch {
	WebDriver driver=null;
	@Given("I have chrome browser open")
	public void i_have_chrome_browser_open() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Sanket/OneDrive/Desktop/REST/CucumberD/src/test/resources/Driver/chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver();  
	}

	@When("I enter selenium step by step in google search")
	public void i_enter_selenium_step_by_step_in_google_search() {
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();  
	    
	}

	@And("click on enter")
	public void click_on_enter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I go to Home page of google search")
	public void i_go_to_home_page_of_google_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
