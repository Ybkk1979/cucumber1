package tags;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGround {
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
System.out.println("user is in login window");
	}

	@When("user enters username and pwd")
	public void user_enters_username_and_pwd() {
System.out.println("user enters user name and pwd");

	
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
System.out.println("user click on login button");
	}

	@Then("user is Navigated to home page")
	public void user_is_navigated_to_home_page() {

	System.out.println("user navigated to home page");
	
	
	}

	@Given("user is in login window")
	public void user_is_in_login_window() {

	System.out.println("user is in login window");
	
	
	}

	@When("user checks in welcome link")
	public void user_checks_in_welcome_link() {

	System.out.println("user clicks on welcome link ");
	
	}

	@Then("logout link is displayed")
	public void logout_link_is_displayed() {

System.out.println("Logout link is clicked");
	
	}

	@When("user click on dash board link")
	public void user_click_on_dash_board_link() {

System.out.println("click on dash board link");

	
	}

	@Then("quuck launch tool bar is displayed")
	public void quuck_launch_tool_bar_is_displayed() {

	System.out.println("quick launch tool bar is displayed");
	
	
	
	}

}
