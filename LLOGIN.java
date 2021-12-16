package tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LLOGIN {
	
	WebDriver d = null; 
	
	   @Before public void setUp(){ 
		   System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
				   d=new ChromeDriver();
				     } 
		
	   
	   
	@Given("user navigates to Facebook")
		
	public void user_navigates_to_facebook() {
		 d.navigate().to("https://www.facebook.com/");
	}

	@When("^I enter Username as (.*) and Password as (.*)$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) {
		 d.findElement(By.id("email")).sendKeys(arg1);
	      d.findElement(By.id("pass")).sendKeys(arg2);
	      d.findElement(By.id("u_0_v")).click(); 	
	      
	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		 if(d.getCurrentUrl().equalsIgnoreCase(
		         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
		            System.out.println("Test Pass"); 
		      } else { 
		         System.out.println("Test Failed"); 
		      } 
		      d.close(); 
		   } 
			
		   @After public void cleanUp(){ 
		      d.close(); 
		   } 	}



