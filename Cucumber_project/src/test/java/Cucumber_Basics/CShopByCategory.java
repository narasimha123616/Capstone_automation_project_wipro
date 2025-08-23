package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CShopByCategory {
WebDriver driver;
	@Given("Ebay search box should be open in the default browser and displayed")
	public void ebay_search_box_should_be_open_in_the_default_browser_and_displayed() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
	}

	@And("add the category wise items")
	public void add_the_category_wise_items() {
		
		   driver.findElement(By.id("gh-cat")).click();
	      
	        driver.findElement(By.xpath("//*[@id=\"gh-cat\"]/option[4]")).click();
	        
	        driver.findElement(By.id("gh-search-btn")).click();
	     
	}

	@Then("displayed  items category wise  were search on the box")
	public void displayed_items_category_wise_were_search_on_the_box() {
	   System.out.println("category wise items displayed");
	}



}
