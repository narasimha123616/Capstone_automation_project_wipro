
package SRC_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeExample {

    public static void loginStep(WebDriver driver, String user1, String pass1, String testExecution) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Manual test: " + testExecution);
        
        // Clear fields
        WebElement user = driver.findElement(By.name("username"));
        user.clear();
        user.sendKeys(user1);

        WebElement pass = driver.findElement(By.name("password"));
        pass.clear();
        pass.sendKeys(pass1);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        // Refresh page to reset state for next login
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Welcome to Orange Login page");
Thread.sleep(4000);
        loginStep(driver, "099009", "97989890", "unable to login");
        loginStep(driver, "hkjgs", "iugd", "unable to login");
        loginStep(driver, "username", "lhlhk", "unable to login");
        loginStep(driver, "", "", "unable to login");
        loginStep(driver, "admin", "admin123", "able to login");

        driver.close(); // Close browser after tests
    }
}

