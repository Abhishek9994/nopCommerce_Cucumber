package AdvancedFormDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitStepdefinition {
	WebDriver driver;
	
	@Given("Open the browser and Enter the URL")
	public void open_the_browser_and_Enter_the_URL() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@Given("Make sure URl is correct or Not")
	public void make_sure_URl_is_correct_or_Not() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
	}

	@When("Enter your first Name")
	public void enter_your_first_Name() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("firstName")).sendKeys("Abhishek");
	}

	@When("Enter your last name")
	public void enter_your_last_name() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("lastName")).sendKeys("Patil");
	}

	@When("Enter your email")
	public void enter_your_email() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("SilentKiller@gmail.com");
	}

	@When("Click on Gender")
	public void click_on_Gender() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

	@When("Enter your contact number")
	public void enter_your_contact_number() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9999999999");
	}

//	@When("Enter your Date of Birth")
//	public void enter_your_Date_of_Birth() {
//	    // Write code here that turns the phrase above into concrete actions
//	    driver.findElement(By.id("dateOfBirthInput")).sendKeys("05 march 1997");
//	    driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, March 5th, 1997']")).click();
//	}

	@When("Enter your Subjects")
	public void enter_your_Subjects() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("mathematics");
	  
	}

	@When("Click on Hobbies")
	public void click_on_Hobbies() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//label[text()='Sports']")).click();
	}

	@When("Upload your picture")
	public void upload_your_picture() {
	    // Write code here that turns the phrase above into concrete actions
      WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
      uploadButton.sendKeys("C:\\Users\\admin\\Downloads\\Abhishek Vilas Patil.jpg");
	}

	@When("Enter your Current Address")
	public void enter_your_Current_Address() {
	    // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Sai Sillcon Valley A-402,Balewadi road, Balewadi,Pune-4110045");
	}

	@Then("User should be successfully submit the form")
	public void user_should_be_successfully_submit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
      System.out.println("User is successfully submit the form ");
	}

	@Then("User should able to see thank you message")
	public void user_should_able_to_see_thank_you_message() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is able to see thank you message");
	}

}
