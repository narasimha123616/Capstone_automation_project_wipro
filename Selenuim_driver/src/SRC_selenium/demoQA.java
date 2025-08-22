package SRC_selenium;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoQA {
    public static void main(String[] args) throws InterruptedException,IOException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(3000);

        // Scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        // First Name
        driver.findElement(By.id("firstName")).sendKeys("nara");

        // Last Name
        driver.findElement(By.id("lastName")).sendKeys("simha");

        // Email
        driver.findElement(By.id("userEmail")).sendKeys("nara@123.com");

        // Gender selection
        driver.findElement(By.xpath("//*[@id='genterWrapper']/div[2]/div[2]/label")).click();

        // Date of Birth
        driver.findElement(By.id("dateOfBirthInput")).click();
        Thread.sleep(4000);

        // Select Year
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select selYear = new Select(year);
        selYear.selectByVisibleText("2025");

        // Select Month
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText("February");

        // Select Date
        driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015']")).click();

        // Subjects
        String[] subjects = {"Maths", "Physics", "Social Studies"};
        WebElement sub = driver.findElement(By.id("subjectsInput"));
        for (String subject : subjects) {
            sub.sendKeys(subject);
            sub.sendKeys(Keys.ENTER);
            Thread.sleep(500); // small wait
        }

        // Upload file
        WebElement img = driver.findElement(By.id("uploadPicture"));
        img.sendKeys("C:\\Users\\nkuru\\OneDrive\\Pictures\\Narasimha Photo.png");

        // Scroll to state and city
        js.executeScript("window.scrollBy(0,500)");

        // State
        WebElement state = driver.findElement(By.id("react-select-3-input"));
        state.sendKeys("NCR");
        state.sendKeys(Keys.ENTER);

        // City
        WebElement city = driver.findElement(By.id("react-select-4-input"));
        city.sendKeys("Delhi");
        city.sendKeys(Keys.ENTER);
        
        driver.findElement(By.id("submit")).click();
        
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("screenshot.png");
		   Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);

        Thread.sleep(3000);
        driver.quit();
    }
}
