package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver=null;
	@Given("Go to Guru99")
	public void go_to_guru99() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Sanket/OneDrive/Desktop/REST/CucumberD/src/test/resources/Driver/chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	     driver=new ChromeDriver(); 
	}

	@When("User fills deatils")
	public void user_fills_deatils() {
		   driver.get("https://demo.guru99.com/test/newtours/register.php");
		     driver.manage().window().maximize();
	}
	
	@And("User enters the deatils")
	public void user_enters_the_deatils() {
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Sanker");
	     driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Ruikar");
	     driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("94789645");
	     driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("RuikarSan@gmail.com");
	     
	     driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Cannol Road");
	     driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Beed");
	     driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Maharashtra");
	     driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("431122");
	     
	     Select dropDown=new Select(driver.findElement(By.name("country")));
	     
	     dropDown.selectByVisibleText("AMERICAN SAMOA");
	     driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Cannol Road");
	     driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Cannol Road");
	     driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Cannol Road");
	 
	}

}
