package tables;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ReadDatasInTable {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String url = "https://the-internet.herokuapp.com/tables"; // Correct URL

        try {
            driver.get(url);

            // Locate table1 by its ID
            WebElement table1 = driver.findElement(By.id("table1"));

            // Get headers from table1
            System.out.print("Table Heading: ");
            List<WebElement> headings = table1.findElements(By.xpath(".//thead//th"));
            for (WebElement heading : headings) {
                System.out.print(heading.getText() + "\t");
            }
            System.out.println();

            // Get all rows from the table body
            List<WebElement> rows = table1.findElements(By.xpath(".//tbody//tr"));
            System.out.println("Table Data:");

            for (WebElement row : rows) {
                // Get all cells in the current row
                List<WebElement> cells = row.findElements(By.xpath(".//td"));
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + "\t");
                }
                System.out.println(); // New line after each row
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
