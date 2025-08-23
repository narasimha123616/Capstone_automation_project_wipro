package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginProgram {
	WebDriver driver = new ChromeDriver();
	
	
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		
	}

	@When("click on username button and enter valid username")
	public void click_on_username_button_and_enter_valid_username() {
		 driver.findElement(By.id("user_login")).click();
		   driver.findElement(By.id("user_login")).sendKeys("username");
		   
	}

	@And("add password")
	public void add_password() {
		 driver.findElement(By.id("user_password")).click();
		   driver.findElement(By.id("user_password")).sendKeys("password");
		  
	}

	@And("click on signin button")
	public void click_on_signin_button() {
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();
		driver.quit();
	  
	}

	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
	    System.out.println("login successfully");
	}


}
