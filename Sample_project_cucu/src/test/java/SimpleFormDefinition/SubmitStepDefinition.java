package SimpleFormDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubmitStepDefinition {
     WebDriver driver;
	
	
	@Given("Open the browser and Enter the URl")
	public void open_the_browser_and_Enter_the_URl() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}

	@Given("Make sure URL is correct")
	public void make_sure_URL_is_correct() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		Thread.sleep(2000);
	}

	@When("Enter your First Name")
	public void enter_your_First_Name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("firstName")).sendKeys("Abhishek");
       Thread.sleep(2000);
	}

	@When("Enter your Last Name")
	public void enter_your_Last_Name() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("lastName")).sendKeys("Patil");
	   Thread.sleep(2000);
	}

	@When("Enter your Email")
	public void enter_your_Email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("email")).sendKeys("SilentKiller@gmail.com");
	   Thread.sleep(2000);
	}

	@When("Enter your Contact Number")
	public void enter_your_Contact_Number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@placeholder='9876543210']")).sendKeys("7575757575");
	   Thread.sleep(2000);
	}

	@When("Enter your Message")
	public void enter_your_Message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("Ek hi nara Ek hi nam, Jai Shree Ram Jai Shree Ram");
	    Thread.sleep(2000);
	}

	@When("Click on submit")
	public void click_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@class='ui green button']")).click();
	   Thread.sleep(2000);
	}

	@Then("user should be successfully submit the form")
	public void user_should_be_successfully_submit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("User is successfully submit the form");
	}

	@Then("pupup should be displayed to user")
	public void pupup_should_be_displayed_to_user() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Alert popup = driver.switchTo().alert();
	     popup.accept();
	     Thread.sleep(2000);
	}
	
	
}
