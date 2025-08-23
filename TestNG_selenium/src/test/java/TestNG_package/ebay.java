package TestNG_package;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebay {
	    WebDriver driver;
WebElement wait;
	    @BeforeTest
	    public void beforeTest() {
	        driver = new ChromeDriver();
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	        System.out.println("Pre-requisite: Opened eBay homepage");
	    }

	    @Test(priority = 1)
	    public void login() throws InterruptedException {
	        driver.findElement(By.linkText("Sign in")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("userid")).sendKeys("erannacom71@gmail.com");
	        driver.findElement(By.id("signin-continue-btn")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("pass")).sendKeys("Nara@123"); 
	        Thread.sleep(1000);
	        driver.findElement(By.id("sgnBt")).click();
	        Thread.sleep(3000);
	    }

	    @Test(priority = 2)
	    public void search() throws InterruptedException {
	        List<String> items = new ArrayList<>();
	        items.add("laptop");
	        items.add("mobile");
	        items.add("tv");

	        for (String item : items) {
	            driver.findElement(By.id("gh-ac")).clear();
	            driver.findElement(By.id("gh-ac")).sendKeys(item);
	            Thread.sleep(1000);
	            driver.findElement(By.id("gh-search-btn")).click();
	            Thread.sleep(2000);
	        }
	    }

	    @Test(priority = 3)
	    public void addtocartANDdelete() throws InterruptedException {
	        driver.findElement(By.id("gh-ac")).clear();
	        driver.findElement(By.id("gh-ac")).sendKeys("cars");
	        driver.findElement(By.id("gh-search-btn")).click();
	        Thread.sleep(2000);

	        // Click the first search result
	        driver.findElement(By.cssSelector("ul.srp-results li.s-item a.s-item__link")).click();
	        Thread.sleep(2000);

	        // Select example options (adjust according to product)
	        driver.findElement(By.xpath("//*[@id=\"nid-spo-30\"]']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//span[text()='1x']")).click();
	        Thread.sleep(1000);

	        // Add to cart
	        driver.findElement(By.id("atcRedesignId_btn")).click();
	        Thread.sleep(2000);

	        // Go to cart and remove item
	        driver.findElement(By.linkText("Go to cart")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

	        System.out.println("✅ Added to cart and deleted successfully.");
	    }


	    @Test(priority = 4)
	    public void changeAccountSettings() throws InterruptedException {
	      
	        driver.findElement(By.linkText("Sign in")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("userid")).sendKeys("erannacom71@gmail.com");
	        driver.findElement(By.id("signin-continue-btn")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("pass")).sendKeys("Nara@123"); 
	        Thread.sleep(1000);
	        driver.findElement(By.id("sgnBt")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.linkText("My eBay")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Account")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Personal information")).click();
	        Thread.sleep(2000);
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        js2.executeScript("window.scrollTo(0, 100);");
	        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("stateOrProvince")).click();
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollTo(0, 100);");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("select option:nth-child(5)")).click();
	        Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, 100);"); 
	        driver.findElement(By.id("address_edit_submit_button")).click();
	        Thread.sleep(2000);
	      

	      
	    }

	    @Test(priority = 5)
	    public void shopByCategory() throws InterruptedException {
	        driver.findElement(By.id("gh-cat")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//*[@id=\"gh-cat\"]/option[4]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("gh-search-btn")).click();
	        Thread.sleep(2000);
	    }

	    @Test(priority = 6)
	        public void productInfo() {
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://www.ebay.com");

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            // search
	            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
	            searchBox.clear();
	            searchBox.sendKeys("laptop bag");
	            driver.findElement(By.id("gh-search-btn")).click();

	            // wait for first product and click
	            WebElement firstProduct = wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath("(//ul[@class='srp-results srp-list clearfix']/li//a[@class='s-item__link'])[1]")
	            ));
	            firstProduct.click();

	            // switch to product page and get title + price
	            WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.cssSelector("h1.x-item-title span.ux-textspans")
	            ));
	            System.out.println("Product Title: " + title.getText());

	            WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.cssSelector("div.x-price-primary span.ux-textspans")
	            ));
	            System.out.println("Product Price: " + price.getText());

	            driver.quit();
	        }
	    



    @Test(priority = 7, dependsOnMethods="login")
	    public void changeLanguage(String countryName) throws InterruptedException {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

    	
    	
    	
    	
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	WebElement countryDropdown = driver.findElement(By.cssSelector("button.gf-flag__button"));
//    	js.executeScript("arguments[0].scrollIntoView(true);", countryDropdown);
//
//	        WebElement countryDropdown1 = driver.findElement(By.cssSelector("button.gf-flag__button"));
//	        countryDropdown1.click();
//
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.gh-eb-GeoSelector")));
//
//	        List<WebElement> countries = driver.findElements(By.cssSelector("div.gh-eb-GeoSelector a"));
//
//	        for (WebElement country : countries) {
//	            String text = country.getText().trim();
//	            System.out.println("Found: " + text);
//
//	            if (text.toLowerCase().contains(countryName.toLowerCase())) {
//	                js.executeScript("arguments[0].click();", country);
//	                System.out.println("✅ Selected country: " + text);
//	                break;
//	            }
//	        }
	    }


	        
	    



	    

	    @Test(priority = 8,dependsOnMethods="login")
	    public void changeAddress() throws InterruptedException {
	        driver.findElement(By.linkText("My eBay")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.linkText("Account")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.linkText("Addresses")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/section[1]/div/div/div[2]/div[2]/div/div[2]/a")).click();
	        Thread.sleep(1000);

	        driver.findElement(By.cssSelector("a#edit-address-SHIPPING")).click();
	        Thread.sleep(2000);

	        WebElement nameField = driver.findElement(By.cssSelector("form input.input-field"));
	        nameField.clear();
	        Thread.sleep(1000);
	        nameField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	        nameField.sendKeys(Keys.DELETE);
	        Thread.sleep(500);
	        nameField.sendKeys("Narasimha Kuruva");

	        driver.findElement(By.cssSelector("button#save-address-btn")).click();
	        Thread.sleep(2000);

	        System.out.println("Navigated to address settings page and updated name.");
	    }
}


