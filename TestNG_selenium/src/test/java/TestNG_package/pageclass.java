package TestNG_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageclass {

    WebDriver driver;

    By email = By.id("userid");
    By cont = By.id("signin-continue-btn");
    By pass = By.id("pass");
    By submit = By.id("sgnBt");

    public pageclass(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String user) {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(user);
    }

    public void clickContinue() {
        driver.findElement(cont).click();
    }

    public void enterPassword(String pwd) {
        driver.findElement(pass).clear();
        driver.findElement(pass).sendKeys(pwd);
    }

    public void clickSubmit() {
        driver.findElement(submit).click();
    }
}
