package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practice6 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html"); 
    }

    @Parameters({"username", "password"})
    @Test
    public void loginTest(String username, String password) throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2000);
        String pageTitle = driver.getTitle();
        System.out.println("Login attempted with: " + username + " | Page Title: " + pageTitle);
    }

    @AfterMethod
    public void Hi() {
        driver.quit();
    }
}
