package pro.btcturk.steps;

import org.testng.Assert;
import pro.btcturk.Methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;


import static pro.btcturk.PageVariables.*;

public class BtcTurkSteps {

    public Double highValue;
    public Double lowValue;
    private Methods methods = new Methods();


    public void checkValues(Double actual, Double expected) {
        boolean isHigh = actual > expected;
        Assert.assertEquals(isHigh, true, actual + " higher than " + expected);
    }


    @Given("Go To BTC Turk Website")
    public void goToWebsite() {
        methods.goToUrl(BTCTURK_URL);
    }

    @And("Get 24H High Value And 24H Low Value")
    public void getValues() {
        lowValue = Double.valueOf(methods.getValue(LOW_VALUE).replace(',','.'));
        highValue = Double.valueOf(methods.getValue(HIGH_VALUE).replace(',','.'));
        checkValues(highValue, lowValue);
    }

    @Then("24H High Value Is It Higher Then 24H Low Value")
    public void checkHighAndLowValue() {
        checkValues(highValue, lowValue);
    }

    @When("Change BTC_TRY To {string}")
    public void changeBtcToUsdt(String pair) {
        methods.waitClickableClick(CLICK_CHANGE_CURRENCY);
        methods.waitVisibilitySendKey(SEARCH_PAIR,pair);
        methods.waitClickableClick(FIRST_VALUE);
    }

}
