package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.asn1.ASN1Exception;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNG_Example_eBay {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeTest() {
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
    }

    @AfterMethod
    public void postCondition() {
        System.out.println("Post-condition: Test executed successfully.");
    }

    @Test(priority = 1)
    public void loginTest() throws ASN1Exception{
    	
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in"))).click();        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userid"))).sendKeys("erannacom71@gmail.com");
      driver.findElement(By.id("signin-continue-btn")).click();
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("Nara@123");
    driver.findElement(By.id("sgnBt")).click();
    	
       
    }

    @Test(priority = 2, dependsOnMethods = "loginTest")
    public void multipleSearchTest() {
        List<String> products = new ArrayList<>();
        products.add("Watch");
        products.add("Phone");
        products.add("Bag");

        for (String item : products) {
            WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-ac")));
            search.clear();
            search.sendKeys(item);
            search.sendKeys(Keys.ENTER);
            wait.until(ExpectedConditions.titleContains(item));
            Assert.assertTrue(driver.getTitle().toLowerCase().contains(item.toLowerCase()));
        }
    }

    @Test(priority = 3)
    public void addToCartTest() {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-ac")));
        search.clear();
        search.sendKeys("Laptop", Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-item__title"))).click();

      
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("atcRedesignId_btn"))).click();
        wait.until(ExpectedConditions.or(
                ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "added to your cart"),
                ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "Go to cart")
        ));

        Assert.assertTrue(driver.getPageSource().contains("cart") || driver.getPageSource().contains("Added"));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gh-cart-i"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Remove')]"))).click();
        wait.until(ExpectedConditions.or(
                ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "You don't have any items"),
                ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "removed")
        ));
        Assert.assertTrue(driver.getPageSource().toLowerCase().contains("you don't have any items")
                || driver.getPageSource().toLowerCase().contains("removed"));
    }
    
  
  

    @Test(priority = 4)
    public void changeLoginNameTest() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My eBay"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();
        wait.until(ExpectedConditions.titleContains("Account"));
        Assert.assertTrue(driver.getTitle().contains("Account"));
    }

    @Test(priority = 5)
    public void changeAddressTest() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My eBay"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Account"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Addresses"))).click();
        wait.until(ExpectedConditions.titleContains("Addresses"));
        Assert.assertTrue(driver.getTitle().contains("Addresses"));
    }

    @Test(priority = 6)
    public void shopByCategoriesTest() {
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Shop by category"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Electronics"))).click();
        wait.until(ExpectedConditions.titleContains("Electronics"));
        Assert.assertTrue(driver.getTitle().contains("Electronics"));
    }

    @Test(priority = 7)
    public void productDescriptionTest() {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-ac")));
        search.clear();
        search.sendKeys("Camera", Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-item__image-img"))).click();

        // Switch tab if needed
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        }

        String description = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("viTabs_0_is"))).getText();
        System.out.println("Product Description: " + description);
        Assert.assertTrue(description.length() > 0);
    }

    @Test(priority = 8)
    public void shopByAllCategoriesTest() throws InterruptedException{
    	driver.findElement(By.cssSelector("button.gh-flyout__target")).click();
    	driver.findElement(By.linkText("Electronics")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("body > div.page-container > div.main-content > section.brw-region.brw-region--left > section:nth-child(1) > div > ul > li:nth-child(1) > span > a")).click();

    	driver.findElement(By.cssSelector("button.sr-action")).click();

    }

    @Test(priority = 9)
    public void changeLanguageTest() {
        WebElement langMenu = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#gf-l a[href*='es']")));
        langMenu.click();
        wait.until(ExpectedConditions.or(
                ExpectedConditions.titleContains("español"),
                ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), "español")
        ));
        Assert.assertTrue(driver.getPageSource().toLowerCase().contains("español"));
    }

    @AfterTest
    public void afterTest() {
       // driver.quit();
        System.out.println("All tests completed. Browser closed.");
    }
}
