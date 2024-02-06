package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSteps extends BaseTest {
	
	WebDriver driver;
	
	@Given("user on the kayak website")
	public void user_on_the_kayak_website() {
	    driver = new ChromeDriver();
	    driver.get("https://www.kayak.com/");
	}

	@Given("user select origin and destination cites")
	public void user_select_origin_and_destination_cites() throws InterruptedException {
	    selectOriginAndDestination(driver);
	}

	@When("user select travel dates")
	public void user_select_travel_dates() throws InterruptedException {
	    selectDates(driver);
	}

	@When("user click on search")
	public void user_click_on_search() {
	    
	}

	@Then("user able to see search result")
	public void user_able_to_see_search_result() {
		
		
	}
	  

	@Then("user select flight from option")
	public void user_select_flight_from_option() {
	}

	@Then("validate the result")
	public void validate_the_result() {
	   
	}




}
