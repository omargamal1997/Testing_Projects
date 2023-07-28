package pages;

import stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class registerPage {

    Select se =null;
    public void Registers(){
        Hooks.driver.findElement(By.className("ico-register")).click();

    }
    public WebElement Gender(String gender) {
        if (gender =="male") {
            return Hooks.driver.findElement(By.id("gender-female"));
        } else {

            return Hooks.driver.findElement(By.id("gender-male"));
        }

    }


    public void FirstName(String username){
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(username);


    }
    public void LastName(String lastname){
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastname);

    }
    public void Email(String email){
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);

    }
    public void Days(String day){
        WebElement days=  Hooks.driver.findElement(By.name("DateOfBirthDay"));
        se=new Select(days);
        se.selectByValue(day);



    }

    public void Months(String month){
        WebElement months = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        se=new Select(months);
        se.selectByValue(month);


    }
    public  void Years(String year){
        WebElement years = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        se=new Select(years);
        se.selectByValue(year);



    }
    public void Password(String password){
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);

    }
    public void ConfirmPass(String confirm){
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm);

    }
    public void RegisterButton(){
        Hooks.driver.findElement(By.id("register-button")).click();

    }
}