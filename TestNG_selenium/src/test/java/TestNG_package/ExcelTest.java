package TestNG_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {

    @DataProvider(name="excelData")
    public Object[][] excelDataProvide() throws IOException {
        String excelpath = "C:\\Users\\nkuru\\OneDrive\\Desktop\\TestXcel\\TestData.xlsx";
        String sheetname = "sheet1";

        FileInputStream fis = new FileInputStream(excelpath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetname);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows-1][cols]; // skip header row

        for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                Cell cell = row.getCell(j);
                data[i-1][j] = (cell == null) ? "" : cell.toString();
            }
        }

        workbook.close();
        fis.close();
        return data;
    }

    @Test(dataProvider="excelData")
    public void testLogin(String username1, String password1) throws InterruptedException {
        System.out.println("username: " + username1 + "  password: " + password1);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        // Enter Excel data into login form
        driver.findElement(By.id("user_login")).sendKeys(username1);
        driver.findElement(By.id("user_password")).sendKeys(password1);
        driver.findElement(By.name("submit")).click();

        Thread.sleep(2000); // just for demo, better to use WebDriverWait

        driver.quit();
    }
}

