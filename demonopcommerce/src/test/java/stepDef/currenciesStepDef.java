package stepDef;

import io.cucumber.java.en.Then;
import pages.homePage;

public class currenciesStepDef {
    homePage homePage=new homePage();
    @Then("user choose euro as currency{string}")
    public void userChooseEuroAsCurrency(String curr){
        homePage.currency(curr);

    }

    @Then("all products has euro sign")
    public void allProductsHasEuroSign() {
        homePage.searchSign();

    }
}
