package Cucumber_Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class loginExcelSteps {

    WebDriver driver;

    @Given("user opens the login page")
    public void user_opens_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
    }

    @When("user enters {string} and {string}")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.id("user_login")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.name("submit")).click();
    }

    @Then("user should be able to attempt login")
    public void user_should_be_able_to_attempt_login() throws InterruptedException {
        Thread.sleep(2000);  
        driver.quit();
    }

   
    public static Object[][] getExcelData() throws IOException {
        String excelpath = "C:\\Users\\nkuru\\OneDrive\\Desktop\\TestXcel\\TestData.xlsx";
        String sheetname = "sheet1";

        FileInputStream fis = new FileInputStream(excelpath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetname);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows - 1][cols]; 

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = (cell == null) ? "" : cell.toString();
            }
        }

        workbook.close();
        fis.close();
        return data;
    }
}
