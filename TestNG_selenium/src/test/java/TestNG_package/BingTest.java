package TestNG_package;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BingTest {
    @Test
    public void openBing() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com");
        Thread.sleep(3000);
        driver.quit();
    }
}

