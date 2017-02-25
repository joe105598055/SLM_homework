package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by joe on 2017/2/25.
 */
public class HelloStepdefs {
    @When("^I ask it to say hi$")
    public void iAskItToSayHi() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^I have a greeting application with \"([^\"]*)\"$")
    public void iHaveAGreetingApplicationWith(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void iReceive(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
