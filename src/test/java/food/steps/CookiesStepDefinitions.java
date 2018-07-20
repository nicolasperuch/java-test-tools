package food.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import food.Cookies;
import org.junit.Assert;

public class CookiesStepDefinitions {


    private Cookies cookies;

    @Given("I bought {int} cookies")
    public void i_bought_cookies(int quantity) {
        cookies = new Cookies(quantity);
    }

    @Given("I ate {int} cookies yesterday")
    public void i_ate_cookies_yesterday(int quantity) {
        cookies.eat(quantity);
    }

    @Given("I ate more {int} cookies this morning")
    public void i_ate_more_cookies_this_morning(int quantity) {
        cookies.eat(quantity);
    }

    @Then("should left {int} cookies")
    public void should_left_cookies(int quantity) {
        Assert.assertEquals(quantity, cookies.getQuantity());
    }
}
