package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class hoverCategorieStepDef {
    homePage homePage=new homePage();


    @When("user hover on category")
    public void userHoverOnCategory() {
        homePage.chooseCategory();

    }

    @And("user hover on sub category")
    public void userHoverOnSubCategory() {
        homePage.hoverSubCategory();

    }
    @And("get sub category name")
    public void getSubCategoryName() {
        homePage.getSubCategoryName();
    }

    @And("user click on sub category")
    public void userClickOnSubCategory() {
        homePage.clickOnSubCategory();
    }


    @Then("user navigate to sub category page")
    public void userNavigateToSubCategoryPage() {
        homePage.assertionSubCategory();
    }
}
