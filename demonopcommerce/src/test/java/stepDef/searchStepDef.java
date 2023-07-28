package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class searchStepDef {
    homePage homePage=new homePage();
    @When("user enter product name{string}")
    public void UserEnterProductName(String Product){
        homePage.searchProduct(Product);

    }
    @And("user click on search button")
    public void userClickOnSearchButton() {
        homePage.searchButton();
    }


    @Then("product reveals successfully")
    public void productRevealsSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        homePage.validUrlProduct();

    }


    @And("verify the search products")
    public void verifyTheSearchProducts() {
        homePage.numberOfProducts();
    }

    @And("verify the name of product{string}")
    public void verifyTheNameOfProduct(String Name) {
        homePage.verifyProductName(Name);
    }

    @When("user enter product SKU{string}")
    public void userEnterProductSKU(String sku) {
        homePage.searchProduct(sku);

    }
}
