package tags;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class p1 {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {

		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	
	
	
	}

	@When("^user needs to select (.*) from dropdown$")
	public void user_needs_to_select_from_dropdown(String name) {
		d.findElement(By.id("searchDropdownBox")).sendKeys(name);
		
	
	
	}

	@Then("^user types (.*) on the text box$")
	public void user_types_on_the_text_box(String text) {

		d.findElement(By.id("twotabsearchtextbox")).sendKeys(text);


	
	}

	@And("user click on search button and closes the browser")
	public void user_click_on_search_button_and_closes_the_browser() throws InterruptedException {

		d.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		d.close();

	
	
	}


	
}






