package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.registerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class registerStepDef {

    //    WebDriver driver=null;
    registerPage Register= new registerPage();

    Select se =null;

    @Given("Navigate to website")
    public void NavigateToWebsite(){

        Register.Registers();
    }
    @And("user enter gender{string}")
    public void UserEnterGender(String gender){
        Register.Gender(gender).click();
    }

    @When("user enter firstname{string}")
    public void userEnterFirstname(String firstname) {
        Register.FirstName(firstname);

    }

    @And("user enter lastname{string}")
    public void userEnterLastname(String lastname) {
        Register.LastName(lastname);
    }

    @And("user enter date{string} {string} {string}")
    public void userEnterDate(String days, String months, String years) {
        Register.Days(days);
        Register.Months(months);
        Register.Years(years);
    }

    @And("user enter email{string}")
    public void userEnterEmail(String email) {
        Register.Email(email);

    }


    @And("user enter password{string}")
    public void userEnterPassword(String password) {
        Register.Password(password);

    }

    @And("user enter confirm password{string}")
    public void userEnterConfirmPassword(String confirmpass) {

        Register.ConfirmPass(confirmpass);
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        Register.RegisterButton();

    }



    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert softAssert=new SoftAssert();
        String colors=Hooks.driver.findElement(By.className("result")).getCssValue("color");
        String success= Hooks.driver.findElement(By.className("result")).getText();

        String expectedmssg="Your registration completed";
        softAssert.assertEquals(success,expectedmssg);
        System.out.println(success);
        System.out.println(colors);
    }




}