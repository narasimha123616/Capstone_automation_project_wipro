package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class GReturnDetails {
	WebDriver driver;
	@Given("Ebay website able to Exchange item")
	public void ebay_website_able_to_exchange_item() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
	}

	@And("change the item or return")
	public void change_the_item_or_return() {
		driver.findElement(By.linkText("Help & Contact")).click();
		driver.findElement(By.cssSelector("input.textbox__control")).click();
		driver.findElement(By.cssSelector("input.textbox__control")).sendKeys("return");
		driver.findElement(By.cssSelector("button.sr-action")).click();
	}

	@Then("displayed  content on return")
	public void displayed_content_on_return() {
	    
	}



}
