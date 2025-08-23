package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class testng {

    WebDriver driver;
    WebDriverWait wait;
    pageclass pg;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        pg = new pageclass(driver);
        System.out.println("Pre-requisite: Opened eBay homepage");
    }

    @AfterMethod
    public void postCondition() {
        System.out.println("Post-condition: Test executed successfully.");
    }

    @Test(priority = 1)
    public void loginTest() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pg.enterEmail("erannacom71@gmail.com");
        pg.clickContinue();

        // ✅ wait until password field is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(pg.pass));

        pg.enterPassword("Nara@123");
        pg.clickSubmit();

        // ✅ wait until login completes (title contains eBay)
        wait.until(ExpectedConditions.titleContains("eBay"));
        System.out.println("Login Successful!");
    }
}
