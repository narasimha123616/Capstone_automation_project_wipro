package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebaylogin {

	WebDriver driver;
	@Given("Ebay login should be open in the default browser")
	public void ebay_login_should_be_open_in_the_default_browser() {
		
	        driver = new ChromeDriver();
	        driver.get("https://www.ebay.com/");
	        driver.manage().window().maximize();
	        System.out.println("Pre-requisite: Opened eBay homepage");
	    }
	

	@When("click on username button and enter valid email")
	public void click_on_username_button_and_enter_valid_email() throws InterruptedException{
		  driver.findElement(By.linkText("Sign in")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("userid")).sendKeys("erannacom71@gmail.com");
	        driver.findElement(By.id("signin-continue-btn")).click();
	        Thread.sleep(2000);
	}

	@And("add the password")
	public void add_the_password() throws InterruptedException{
		driver.findElement(By.id("pass")).sendKeys("Nara@123"); 
        Thread.sleep(1000);
	}

	@And("click on ok button")
	public void click_on_ok_button() throws InterruptedException{
		 driver.findElement(By.id("sgnBt")).click();
	        Thread.sleep(3000);
	}

	@Then("login successfully and open home page in the ebay website")
	public void login_successfully_and_open_home_page_in_the_ebay_website() {
	   System.out.println("login successfully Bhaii");
	   driver.close();
	}
}
