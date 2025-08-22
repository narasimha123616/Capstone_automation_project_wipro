package SRC_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/automation-practice-form");
	        Thread.sleep(3000);
WebElement fname=driver.findElement(By.cssSelector("div>input[placeholder=\"First Name\"]"));
	    fname.sendKeys("nara");    
	    
	    
	    WebElement lname=driver.findElement(By.cssSelector("div>input[placeholder=\"Last Name\"]"));
	    lname.sendKeys("simha");  
	    
	  //  WebElement num=driver.findElement(By.cssSelector("div>input[placehoder=\"Mobile Number\"]"));
	    WebElement num = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));

	    num.sendKeys("9876543210");
	    
//	    driver.findElement(By.id("dateOfBirthInput")).click();
//	    driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
//	    driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
//	    driver.findElement(By.cssSelector("div[aria-label=\"choose Tuesday, April 1st, 2025\"]")).click();
//     
	 
	    driver.findElement(By.id("dateOfBirthInput")).click();

	   
	    WebElement yearDropdown = driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
	    yearDropdown.click();
	    driver.findElement(By.cssSelector("select.react-datepicker__year-select option[value='2025']")).click();

	   
	    WebElement monthDropdown = driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
	    monthDropdown.click();
	    driver.findElement(By.cssSelector("select.react-datepicker__month-select option[value='3']")).click();

	    
	    driver.findElement(By.cssSelector("div[aria-label='Choose Tuesday, April 1st, 2025']")).click();

	    WebElement address = driver.findElement(By.cssSelector("textarea#currentAddress"));
        address.sendKeys("123, Selenium Street, Test City, QA Land");

       
        WebElement upload = driver.findElement(By.cssSelector("input#uploadPicture"));
        upload.sendKeys("\"C:\\Users\\nkuru\\OneDrive\\Pictures\\Narasimha Photo.png\"");  // change path to your file

    
        driver.findElement(By.cssSelector("#state")).click();
        driver.findElement(By.cssSelector("div.css-11unzgr div[id*='react-select'] div:contains('NCR')")).click();

    
        driver.findElement(By.cssSelector("#city")).click();
        driver.findElement(By.cssSelector("div.css-11unzgr div[id*='react-select'] div:contains('Delhi')")).click();

        
        System.out.println("Form fields filled successfully!");
	    
	    
	}

}
