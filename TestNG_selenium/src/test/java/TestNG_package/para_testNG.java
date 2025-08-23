package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class para_testNG {

    // Thread-safe WebDriver for parallel execution
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Getter for WebDriver
    public WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void setUp() {
        WebDriver drv = new ChromeDriver();
        driver.set(drv);
        //getDriver().manage().window().maximize();
    }

    @Test(priority = 4)
    public void eBay() {
        getDriver().get("https://www.ebay.com/");
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.titleContains("Electronics"));
        Assert.assertTrue(getDriver().getTitle().toLowerCase().contains("ebay"),
                "eBay title validation failed");
    }

    @Test(priority = 3)
    public void amazon() {
        getDriver().get("https://www.amazon.in/");
        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.urlContains("amazon.in"));
        String actualUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.startsWith("https://www.amazon.in"),
                "Amazon URL validation failed. Found: " + actualUrl);
    }

    @Test(priority = 1)
    public void flipkart() {
        getDriver().get("https://www.flipkart.com/");

        // Close login popup if present
        try {
            WebElement closeBtn = new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button._2KpZ6l._2doB4z")));
            closeBtn.click();
        } catch (Exception e) {
            // Popup not shown, continue
        }

        new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.titleContains("Online Shopping"));
        Assert.assertTrue(getDriver().getTitle().contains("Online Shopping"),
                "Flipkart title validation failed");
    }

    @Test(priority = 2)
    public void zerobank() {
        getDriver().get("http://zero.webappsecurity.com/");
        WebElement search = new WebDriverWait(getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("searchTerm")));
        search.sendKeys("Online banking");
        search.sendKeys(Keys.ENTER);
        Assert.assertTrue(getDriver().getTitle().toLowerCase().contains("search"),
                "Search results page not loaded");
    }

    @AfterMethod
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            //driver.remove();
        }
    }
}
