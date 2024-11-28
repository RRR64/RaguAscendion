package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Author {
	
	@Given("user launch the url")
	public void user_launch_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		System.out.println("URL is launched");
	}
	@When("enters user credentials")
	public void enters_user_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("URL is launched 1");
		
	}
	@When("clicks Login button")
	public void clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("URL is launched 2");
		
	}
	@Then("Application should move to Home Page")
	public void application_should_move_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		System.out.println("URL is launched 3");
		
	}


}
