package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.RequestResponse;

public class MyStepdefs {
    RequestResponse requestResponse = new RequestResponse();
    @Given("I enter the zipcode and city")
    public void iEnterTheZipcodeAndCity() {
        requestResponse.getWeatherData("Delhi", "yes");
    }

    @Then("I should get the data")
    public void iShouldGetTheData() {
        requestResponse.validateData("Delhi", "yes");
    }
}
