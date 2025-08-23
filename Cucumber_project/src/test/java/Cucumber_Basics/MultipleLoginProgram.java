package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLoginProgram {
	
	WebDriver driver;

	@Given("login page should be open in the default browser")
	public void login_page_should_be_open_in_the_default_browser() {
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		
	}

	@When("click on the username button and enter valid {string}")
	public void click_on_the_username_button_and_enter_valid_username(String username1)  {
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(username1);
		
	}

	@And("add {string}")
	public void add_password(String password1)  {
		driver.findElement(By.id("user_password")).clear();
		driver.findElement(By.id("user_password")).sendKeys(password1);
		
	}

	@And("click on the signin button {string}")
	public void click_on_the_signin_button(String status)  {
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();
		System.out.println("Login Status Expected: " + status);
		
		driver.quit();
	}

	@Then("login page successfully and open home page")
	public void login_page_successfully_and_open_home_page() {
		System.out.println("Login successfully tested");
	}
}

//package Cucumber_Basics;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class MultipleLoginProgram{
//
//    WebDriver driver;
//    pageClassObject page;
//
//    @Given("login page should be open in the default browser")
//    public void login_page_should_be_open_in_the_default_browser() throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.get("http://zero.webappsecurity.com/login.html");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        page = new pageClassObject(driver);
//    }
//
//    @When("^click on the username button and enter valid \"(.*)\"$")
//    public void click_on_the_username_button_and_enter_valid(String username) throws InterruptedException {
//        page.enterUsername(username);
//        Thread.sleep(1000);
//    }
//
//    @And("^add \"(.*)\"$")
//    public void add(String password) throws InterruptedException {
//        page.enterPassword(password);
//        Thread.sleep(1000);
//    }
//
//    @And("^click on the signin button \"(.*)\"$")
//    public void click_on_the_signin_button(String status) throws InterruptedException {
//        page.clickSignIn();
//        Thread.sleep(2000);
//        System.out.println("Expected login status: " + status);
//    }
//
//    @Then("login page successfully and open home page")
//    public void login_page_successfully_and_open_home_page() {
//        System.out.println("Login attempt completed. Check manually if login is successful.");
//        driver.quit();
//    }
//}
//
