package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HSelectByCaterogies {
	WebDriver driver;
	@Given("Ebay website able to search by categories")
	public void ebay_website_able_to_search_by_categories() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
	}

	@And("search theitems by categories")
	public void search_theitems_by_categories() {
		driver.findElement(By.cssSelector("button.gh-flyout__target")).click();
    	driver.findElement(By.linkText("Electronics")).click();
    	//Thread.sleep(3000);
    	driver.findElement(By.cssSelector("body > div.page-container > div.main-content > section.brw-region.brw-region--left > section:nth-child(1) > div > ul > li:nth-child(1) > span > a")).click();
    	driver.findElement(By.cssSelector("button.sr-action")).click();
		
	}

	@Then("displayed  items categoies wise")
	public void displayed_items_categoies_wise() {
	    System.out.println("items");
	}


}
