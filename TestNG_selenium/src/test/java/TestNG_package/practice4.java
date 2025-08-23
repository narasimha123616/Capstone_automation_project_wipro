package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class practice4 {

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
        	{"username","password"},
            {"admin", "adminn"},
            {"use", "pa"},
            {"admin", "password"},
            {"admin", "admin@123"},
            
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);

        System.out.println("Tried login with Username: " + username + " | Password: " + password);

        driver.quit();
    }
}
