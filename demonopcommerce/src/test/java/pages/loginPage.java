package pages;

import stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    public void Navigate(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    public void Email(String email){
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);

    }
    public void Password(String password){
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);

    }
    public void LoginButton(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
