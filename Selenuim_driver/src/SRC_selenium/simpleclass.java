package SRC_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class simpleclass {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("hii");

        // Set the ChromeDriver executable path
        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkuru\\OneDrive\\Desktop\\Selenium_driver\\chromedriver-win64\\chromedriver.exe");
        // Create ChromeDriver object to open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        String expectedurl="https://www.selenium.dev/";
        String actualurl=driver.getCurrentUrl();
        
        
        String expectedtitle="Selenium dev";
        String actualtitle=driver.getTitle();
        
        System.out.println(expectedurl);
        System.out.println(expectedtitle);
        System.out.println(actualtitle);
        System.out.println(actualurl);
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        if(expectedtitle.equals(actualtitle)) {
        	 System.out.println("hii success");
        }
        else {
        	 System.out.println("hii failed");
        }
        
        if(expectedurl.equals(actualurl)) {
       	 System.out.println("hii success");
       }
       else {
       	 System.out.println("hii failed");
       }

        // Open the Selenium official website
        

        // Wait for 4 seconds so you can see the opened browser
       

        // Close the browser
        driver.close();
    }
}

