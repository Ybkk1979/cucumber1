package tags;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewTest {
  @BeforeMethod
  @Given("user in amazon page")

	  public void user_in_amazon_page() {
	System.out.println("this is my first method");     
	     
  }
  @When("user needs select books from drop down")
  public void user_needs_select_books_from_drop_down() {
System.out.println("user searching for books from dropdown box");

  }
  	
	  @Then("user seachers for {string} in text box")

	  public void user_seachers_for_in_text_box(String string) {
		  System.out.println("this is my second test case");

	  }

@AfterMethod
	  @Then("user need to click on OK button")
	  public void user_need_to_click_on_ok_button() {
	      // Write code here that turns the phrase above into concrete actions
	      throw new io.cucumber.java.PendingException();
	  }
}



	  
	  


