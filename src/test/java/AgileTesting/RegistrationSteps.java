package AgileTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class RegistrationSteps extends TestCase {
	String userName , userEmail , actionButton;
	@Given("^\"([^\"]*)\"  has enter \"([^\"]*)\" as e-mail, \"([^\"]*)\" as password \"([^\"]*)\" as city and \"([^\"]*)\" as phone no and Name as \"([^\"]*)\"$")
	public void inputData(String name, String email, String password, String city, String phone, String button) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		userName = name;
		userEmail = email;
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String button) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    actionButton = button; 
	}

	@Then("^System Display \"([^\"]*)\"$")
	public void system_Display(String message) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		RegisterBLL register = new RegisterBLL();
		assertEquals(message, register.Validate(userName, userEmail));
	}

	@Then("^Send a mail with \"([^\"]*)\"$")
	public void send_a_mail_with(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new PendingException();
		RegisterBLL register = new RegisterBLL();
		assertEquals(true, register.SendMail(userName,userEmail));
		
	}

}
