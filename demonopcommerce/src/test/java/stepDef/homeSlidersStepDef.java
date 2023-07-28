package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class homeSlidersStepDef {
    homePage homePage=new homePage();
    @When("user click on first slider")
    public void userClickOnFirstSlider(){

        homePage.glasxySlider();
    }

    @And("user click on the product")
    public void userClickOnTheProduct() {
        homePage.clickOnFirstSliderProduct();
    }

    @Then("user navigate to product page")
    public void userNavigateToProductPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.assertFirstSliderProduct();
    }

    @When("user click on second slider")
    public void userClickOnSecondSlider() {
        homePage.iPhoneSlider();
    }

    @Then("user navigate to second product page")
    public void userNavigateToSecondProductPage() throws InterruptedException {
        Thread.sleep(2000);
        homePage.assertSecondSliderProduct();
    }
}
