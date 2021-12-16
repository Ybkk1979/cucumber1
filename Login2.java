package tags;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2 {
	WebDriver driver;

	@Given("Open the chrome and start application")
	public void open_the_firefox_and_start_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		

	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	}
	
		
		

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		driver.findElement(By.name("Submit")).click();

	}
	
}
