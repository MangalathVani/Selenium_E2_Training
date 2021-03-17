package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagStepDef {
	
	/*@Before(value="@RegressionTest", order =1)
	public void setUpScenario() {
		System.out.println("Before Regresion Scenario");
	}
	@Before(value="@RegressionTest", order =2)
	public void setUpStep() {
		System.out.println("Before Smoke Scenario");
	}*/
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	   }

	@When("User enters invalid cred")
	public void user_enters_invalid_cred() {
		System.out.println("User enters invalid cred");
	    }

	@Given("User is on Task Page")
	public void user_is_on_Task_Page() {
		System.out.println("User is on Task Page");
	   }

	@Given("User is on deal Page")
	public void user_is_on_deal_Page() {
		System.out.println("User is on deal Page");
	 }

	@Given("User is on contacts Page")
	public void user_is_on_contacts_Page() {
		System.out.println("User is on contacts Page");
	   }

	@Given("User is on companies Page")
	public void user_is_on_companies_Page() {
		System.out.println("User is on companies Page");
	   }

	@Given("User  click logout")
	public void user_click_logout() {
		System.out.println("User click logout");
	  }
	@Given("User search Cucumber text")
	public void user_search_Cucumber_text() {
		System.out.println("User search Cucumber text");
	}
	@Given("User search Java text")
	public void user_search_Java_text() {
		System.out.println("User search Java text");
	}
	@Given("User search Selenium text")
	public void user_search_Selenium_text() {
		System.out.println("User search Selenium text");
	}
	@Then("should display Selenium search page")
	public void should_display_Selenium_search_page() {
		System.out.println("should display Selenium search page");
	}
	/*@After
	public void tearDownScenario() {
		System.out.println("After each Scenario");
	}
	@AfterStep
	public void tearDownStep() {
		System.out.println("After each Step");
	}*/

}
