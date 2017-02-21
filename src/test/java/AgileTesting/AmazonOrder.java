package AgileTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class AmazonOrder extends TestCase {
	
	String selectWatch , bestWatch , addtoCart ,Buy, Submit;
	
	@Given("^Search for \"([^\"]*)\" on amazon$")
	public void search_for_on_amazon(String selectwatch) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		selectWatch = selectwatch;
	}

	@When("^Select \"([^\"]*)\"$")
	public void select(String bestwatch) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bestWatch = bestwatch;
	}

	@Then("^Click on \"([^\"]*)\" after selecting product$")
	public void click_on_after_selecting_product(String addtocart) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		addtoCart = addtocart;
		
		RegisterBLL register = new RegisterBLL();
		//assertEquals(message, register.Validate(userName, userEmail));
	}

	@Then("^Click on \"([^\"]*)\" within cart$")
	public void click_on_within_cart(String buy) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Buy = buy;
		
		RegisterBLL register = new RegisterBLL();
		//assertEquals(message, register.Validate(userName, userEmail));
	}

	@Then("^Click \"([^\"]*)\" button$")
	public void click_button(String submit) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		Submit = submit;
		
		RegisterBLL register = new RegisterBLL();
		//assertEquals(true, register.SendMail(userName,userEmail));
	}

}
