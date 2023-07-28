package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import stepDef.Hooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class homePage {
    Actions action = new Actions(Hooks.driver);
    Select se = null;
    SoftAssert softAssert = new SoftAssert();
    Random random = new Random();
    int upperBound = 2;
    int int_random = random.nextInt(upperBound);


    public void currency(String curr) {
        WebElement cuurencies = Hooks.driver.findElement(By.id("customerCurrency"));
        se = new Select(cuurencies);
        se.selectByValue(curr);
    }


    public void searchSign() {
        String[] euroSign = {
                Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span")).getText(),
                Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span")).getText(),
                Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[1]/span")).getText(),
                Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[1]/span")).getText()
        };
        for (int i = 0; i < euroSign.length; i++) {
            Assert.assertTrue(euroSign[i].contains("€"));
            System.out.println(euroSign[i]);


        }
    }

    public void searchProduct(String productName) {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(productName);
    }

    public void searchButton() {
        Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

    }

    public void validUrlProduct() {

        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
    }

    public void numberOfProducts() {
        int x = Hooks.driver.findElements(By.className("item-box")).size();
        System.out.println(x);
    }

    public void verifyProductName(String Name) {
        By mySelector = By.className("product-title");
        List<WebElement> myElements = Hooks.driver.findElements(mySelector);
        for (WebElement e : myElements) {
            String y = e.getText();
            softAssert.assertTrue(y.contains(Name));
        }
    }

    public void chooseCategory() {


        System.out.println(int_random);

        WebElement webElements = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li")).get(int_random);
//        WebElement computers = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        action.moveToElement(webElements).perform();
    }

    public void hoverSubCategory() {

        if (int_random == 0) {
            WebElement webElements = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li")).get(int_random);
            action.moveToElement(webElements).perform();
            WebElement computerElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li")).get(int_random);
            action.moveToElement(computerElement).perform();

        } else if (int_random == 1) {
            WebElement webElements = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li")).get(int_random);
            action.moveToElement(webElements).perform();
            WebElement electronicsElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li")).get(int_random);
            action.moveToElement(electronicsElement).perform();
        } else if (int_random == 2) {
            WebElement webElements = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li")).get(int_random);
            action.moveToElement(webElements).perform();
            WebElement apperalElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li")).get(int_random);
            action.moveToElement(apperalElement).perform();
        }


    }

    public void getSubCategoryName() {

        if (int_random == 0) {

            WebElement computerElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li")).get(int_random);
            String name = computerElement.getText();
            System.out.println(name);

        } else if (int_random == 1) {

            WebElement electronicsElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li")).get(int_random);
            String name1 = electronicsElement.getText();
            System.out.println(name1);
        } else if (int_random == 2) {

            WebElement apperalElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li")).get(int_random);
            String name2 = apperalElement.getText();
            System.out.println(name2);
        }


    }

    public void clickOnSubCategory() {
        if (int_random == 0) {

            WebElement computerElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li")).get(int_random);
            computerElement.click();

        } else if (int_random == 1) {

            WebElement electronicsElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li")).get(int_random);
            electronicsElement.click();
        } else if (int_random == 2) {

            WebElement apperalElement = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li")).get(int_random);
            apperalElement.click();
        }

    }

    public void assertionSubCategory() {

        String title = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")).getText();
        String title1 = title.toLowerCase().trim();
        if (int_random == 0) {

            String subCategory = "Desktops";
            String subCategory1 = subCategory.toLowerCase().trim();
            Assert.assertEquals(title1, subCategory1);

        } else if (int_random == 1) {
            String subCategory = "Cell phones";
            String subCategory1 = subCategory.toLowerCase().trim();
            Assert.assertEquals(title1, subCategory1);
        } else if (int_random == 2) {

            String subCategory = "Accessories";
            String subCategory1 = subCategory.toLowerCase().trim();
            Assert.assertEquals(title1, subCategory1);
        }

    }

    public void glasxySlider() {
        WebElement firstSlider = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
        firstSlider.click();
        Assert.assertTrue(firstSlider.isDisplayed());

    }

    public void clickOnFirstSliderProduct() {
        Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]")).click();
    }

    public void assertFirstSliderProduct() {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    public void iPhoneSlider() {
        WebElement secondSlider = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
        secondSlider.click();
        Assert.assertTrue(secondSlider.isDisplayed());


    }

    public void assertSecondSliderProduct() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }

    public void followUsOnFacebook() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")).click();
    }

    public void verifyFacebook() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://web.facebook.com/nopCommerce?_rdc=1&_rdr"));
    }

    public void followUsOnTwitter() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")).click();
    }

    public void verifyTwitter() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://twitter.com/"));
    }

    public void followUsOnRss() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")).click();
    }

    public void verifyRss() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://rss.com/"));
    }

    public void followUsOnYoutube() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")).click();
    }

    public void verifyYoutube() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        System.out.println(tabs.size());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.youtube.com/user/nopCommerce"));
    }

    public void clickOnWishList() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();
    }

    public void verifyWishList() {

        String back = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div")).getCssValue("background-color");
        WebElement backTxt = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        softAssert.assertTrue(backTxt.isDisplayed());
        System.out.println(back);
    }

    public void wishList() {
        Hooks.driver.findElement(By.className("wishlist-label")).click();
        int number = Hooks.driver.findElements(By.className("product")).size();
        Assert.assertTrue(number > 0);
    }
}
