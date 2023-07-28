package stepDef;

import org.openqa.selenium.support.Color;
import pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class loginStepDef {
    loginPage Login=new loginPage();


    @Given("Navigate to login page")
    public void NavigateToLoginPage(){
        Login.Navigate();


    }
    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String Email, String Password) {
        Login.Email(Email);
        Login.Password(Password);

    }



    @And("click on login button")
    public void clickOnLoginButton() {

        Login.LoginButton();
    }

    @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Hooks.driver.findElement(By.className("ico-account")).isDisplayed();
        softAssert.assertAll();


    }




    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert softAssert=new SoftAssert();
        String failed=Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        softAssert.assertTrue(failed.contains("Login was unsuccessful"));
        String colors=Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getCssValue("color");
        String newColor=Color.fromString(colors).asHex();
        System.out.println(newColor);
        softAssert.assertAll();
    }
}

