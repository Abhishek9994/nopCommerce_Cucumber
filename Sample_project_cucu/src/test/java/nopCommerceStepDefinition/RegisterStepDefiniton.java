package nopCommerceStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefiniton {
	
	WebDriver driver;
	
	
	@Given("Open the chrome browser and Enter the URL")
	public void open_the_chrome_browser_and_Enter_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}

	@Given("Make sure URL is vaild")
	public void make_sure_URL_is_vaild() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 driver.manage().window().maximize();
	}

	@When("Click on your gender")
	public void click_on_your_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	}

	@When("Enter your First name")
	public void enter_your_First_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Abhishek");
	}

	@When("Enter your Last name")
	public void enter_your_Last_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patil");
	}

	@When("Enter your company Email")
	public void enter_your_company_Email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("SilentKiller@gmail.com");
		Thread.sleep(2000);
	}

	@When("Enter your Company name")
	public void enter_your_Company_name() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Masai School");
	}

	@When("Enter your Password")
	public void enter_your_Password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Abhi9994");
	}

	@When("Enter Your  Confirm password")
	public void enter_Your_Confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Abhi9994");
	}

	@When("Click on Register")
	public void click_on_Register() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		Thread.sleep(2000);
	}

	@Then("User should be successfully register")
	public void user_should_be_successfully_register() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is successfully Register");
	}

	@Then("confirmation message should be displayed")
	public void confirmation_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("confirmation message is displayed to user ");
	    
	}
	

}
