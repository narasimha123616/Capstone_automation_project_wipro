package SRC_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigateExamples {

	public static void main(String[] args) throws InterruptedException{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver.exe");
		 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver-win64");

		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com");
		  Thread.sleep(2000);
		  
		  System.out.println(driver.getTitle());
		  
		  driver.navigate().to("https://www.facebook.com");
		  Thread.sleep(2000);
		  
		  System.out.println(driver.getTitle());
		  
		  driver.navigate().back();
		  
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  
		  Thread.sleep(2000);
		  driver.navigate().refresh();
		  
		  driver.close();
		  
		  
		  
	}

}
