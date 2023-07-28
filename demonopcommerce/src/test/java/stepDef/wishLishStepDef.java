package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class wishLishStepDef {
    homePage homePage=new homePage();
    @When("user click on wishList icon")
    public void userClickOnWishListIcon(){

        homePage.clickOnWishList();
    }

    @Then("item added successfully")
    public void itemAddedSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        homePage.verifyWishList();
    }

    @Then("item added in wishList successfully")
    public void itemAddedInWishListSuccessfully() throws InterruptedException {

        Thread.sleep(7000);
        homePage.wishList();
    }
}
