package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class followUsStepDef {
    homePage homePage=new homePage();

    @When("user click on facebook button")
    public void userClickOnFacebookButton(){
        homePage.followUsOnFacebook();
    }

    @Then("user navigate into facebook")
    public void userNavigateIntoFacebook() {
        homePage.verifyFacebook();
    }

    @When("user click on twitter button")
    public void userClickOnTwitterButton() {
        homePage.followUsOnTwitter();

    }

    @Then("user navigate into twitter")
    public void userNavigateIntoTwitter() {
        homePage.verifyTwitter();

    }

    @When("user click on rss button")
    public void userClickOnRssButton() {
        homePage.followUsOnRss();

    }

    @Then("user navigate into rss")
    public void userNavigateIntoRss() {
        homePage.verifyRss();

    }

    @When("user click on youtube button")
    public void userClickOnYoutubeButton() {
        homePage.followUsOnYoutube();

    }

    @Then("user navigate into youtube")
    public void userNavigateIntoYoutube() {
        homePage.verifyYoutube();
    }
}
