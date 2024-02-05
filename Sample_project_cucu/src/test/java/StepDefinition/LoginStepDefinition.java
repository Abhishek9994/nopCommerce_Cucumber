package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("Open the browser and enter the URL")
	public void open_the_browser_and_enter_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}

	@Given("make sure URL is correct")
	public void make_sure_URL_is_correct() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("https://the-internet.herokuapp.com/login");
	}

	@When("Enter your username")
	public void enter_your_username() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("username")).sendKeys("tomsmith");
	}

	@When("Enter your password")
	public void enter_your_password() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	}

	@When("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	}

	@Then("user should be successfully login")
	public void user_should_be_successfully_login() {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("User is successfully Login");
	    
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Home page is displayed to User");
	}
}
