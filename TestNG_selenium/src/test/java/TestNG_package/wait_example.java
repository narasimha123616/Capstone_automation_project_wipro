package TestNG_package;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wait_example {
    WebDriver driver;

    @BeforeTest
    public void chrome() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.bing.com");
      
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
	@Test
    public void fire() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.tirabeauty.com/");
        Thread.sleep(2000);
    }

    @Test
//    public void edge() throws InterruptedException {
//       System.getProperty("C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver");
//    	driver = new EdgeDriver();
//        driver.get("https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334");
//        Thread.sleep(2000);
//    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
