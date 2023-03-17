package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.CommonMethods;

public class browserSteps extends CommonMethods {
	
	@Given("Enter this word in searchBox {string}")
    public void sendKey(String string) {
        sentText(hp.searchBox, string);
    }
    
	
	@When("Click the search button")
	public void click_the_search_button() {
	    click(hp.searchBox);
	}

    @Then("Get the title")
    public void get_the_title() {
       getTitle();
    }
    
    @Then("Get the url")
    public void get_the_url() {
       getURL();
    }

}
