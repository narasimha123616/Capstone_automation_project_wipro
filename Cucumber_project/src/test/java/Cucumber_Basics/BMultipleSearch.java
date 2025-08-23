package Cucumber_Basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BMultipleSearch {
	WebDriver driver;
	List<String> items = new ArrayList<>();
	
	@Given("Ebay search box should be open in the default browser")
	public void ebay_search_box_should_be_open_in_the_default_browser() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
    
	}

	@And("add the items")
	public void add_the_items() {
		 List<String> items = new ArrayList<>();
	        items.add("laptop");
	        items.add("mobile");
	        items.add("tv");

	        for (String item : items) {
	            driver.findElement(By.id("gh-ac")).clear();
	            driver.findElement(By.id("gh-ac")).sendKeys(item);
	           
	            driver.findElement(By.id("gh-search-btn")).click();
	           
	        
	}
	}
	@Then("displayed items were search on the box")
	public void displayed_items_were_search_on_the_box() {
	    System.out.println("Displayed item");
	    driver.close();
	}

}



    
  
