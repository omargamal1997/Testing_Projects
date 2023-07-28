package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver driver=null;
    @Before
    public void user_opens_browser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");


    }
    @After
    public void closebrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

