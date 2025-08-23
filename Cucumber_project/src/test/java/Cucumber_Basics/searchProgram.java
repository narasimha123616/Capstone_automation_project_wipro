package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchProgram {
	WebDriver driver=new ChromeDriver();
	@When("click on the Search button")
	public void click_on_the_search_button() throws InterruptedException{
		 driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@And("Enter the items")
	public void enter_the_items() throws InterruptedException{
		  driver.findElement(By.id("twotabsearchtextbox")).clear();
	         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
	         Thread.sleep(1000);
	         driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("display the items")
	public void display_the_items() throws InterruptedException{
	    System.out.println("toys displayed");
	    driver.quit();
	}



}
