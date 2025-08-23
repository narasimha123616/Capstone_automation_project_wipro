package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageClassObject {

    WebDriver driver;

    By user = By.id("user_login");      
    By pass = By.id("user_password");    
    By signin = By.xpath("//*[@id=\\\"login_form\\\"]/div[2]/input"); 

    By search = By.id("twotabsearchtextbox");   
    By searchBtn = By.id("nav-search-submit-button"); 

    public pageClassObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void enterUsername(String username) {
        WebElement usernameField = driver.findElement(user);
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(pass);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signin).click();
    }

    public void clickSearchBox() {
        driver.findElement(search).click();
    }

    public void enterSearchItem(String item) {
        WebElement searchField = driver.findElement(search);
        searchField.clear();
        searchField.sendKeys(item);
    }

    public void clickSearchButton() {
        driver.findElement(searchBtn).click();
    }
}
