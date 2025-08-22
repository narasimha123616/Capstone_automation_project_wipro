package SRC_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element {

    public static void loginStep(WebDriver driver, String user1, String pass1, String testExecution) throws InterruptedException {
        System.out.println("Manual test: " +testExecution);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver.exe");

        // Clear the fields before entering data
        WebElement user = driver.findElement(By.id("user_login")); // Corrected ID
      //  user.clear();
        user.sendKeys(user1);

        WebElement pass = driver.findElement(By.id("user_password"));
       // pass.clear();
        pass.sendKeys(pass1);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);

        // Optionally add verification here, e.g., check URL or page element for login success
    }

    public static void main(String[] args) throws InterruptedException {
        // Set your ChromeDriver path here:
      
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        System.out.println("Welcome to Zero bank Login page");

        loginStep(driver, "099009", "97989890", "unable to login");
        loginStep(driver, "hkjgs", "iugd", "unable to login");
        loginStep(driver, "username", "lhlhk", "unable to login");
        loginStep(driver, "", "", "unable to login");
        loginStep(driver, "username", "password", "able to login");

        driver.quit(); // Close browser after tests
    }
}
