package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginParameterized {
	WebDriver driver=null;
	@Given("Browser open")
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Sanket/OneDrive/Desktop/REST/CucumberD/src/test/resources/Driver/chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver(); 
	}

	@And("User is on Login page")
	public void user_is_on_login_page() {
		 driver.get("https://practicetestautomation.com/practice-test-login/");
	     driver.manage().window().maximize();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(string);
	     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(string);
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		   driver.findElement(By.id("submit")).click();
	}




}
