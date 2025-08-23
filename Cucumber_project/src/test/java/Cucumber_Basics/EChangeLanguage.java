package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EChangeLanguage {
WebDriver driver;
	@Given("Ebay website able to change Language")
	public void ebay_website_able_to_change_language() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
	}

	@And("change the Language")
	public void change_the_language() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		 WebElement flagButton = driver.findElement(By.cssSelector("button[aria-label*='United States']"));
	        flagButton.click();

		
	}
	@Then("displayed  Language changing")
	public void displayed_language_changing() {
	    
	}



}
