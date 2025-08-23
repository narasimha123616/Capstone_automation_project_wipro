package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest1 {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
    }

    @AfterMethod
    public void postCondition() {
        System.out.println("Post-condition: Test executed successfully.");
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("userid")).sendKeys("erannacom71@gmail.com");
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Nara@123");
        driver.findElement(By.id("sgnBt")).click();
        Assert.assertTrue(driver.getTitle().contains("eBay"), "Login failed");
    }

    @Test(priority = 2)
    public void multipleSearchTest() throws InterruptedException {
        List<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Phone");
        products.add("Bag");

        for (String item : products) {
            WebElement search = driver.findElement(By.id("gh-ac"));
            search.clear();
            search.sendKeys(item);
            search.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            Assert.assertTrue(driver.getTitle().toLowerCase().contains(item.toLowerCase()));
        }
    }

    @Test(priority = 3)
    public void addToCartTest() throws InterruptedException {
        driver.findElement(By.id("gh-ac")).sendKeys("Laptop", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElements(By.cssSelector(".s-item__title")).get(1).click();
        Thread.sleep(2000);
        driver.findElement(By.id("atcRedesignId_btn")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("added to your cart"));
    }


    @AfterTest
    public void afterTest() {
        driver.quit();
        System.out.println("All tests completed. Browser closed.");
    }
}

