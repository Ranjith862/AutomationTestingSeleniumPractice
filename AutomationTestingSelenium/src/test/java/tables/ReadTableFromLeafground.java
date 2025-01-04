package tables;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTableFromLeafground {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        String url = "https://leafground.com/table.xhtml";
        try {
            driver.get(url);

            // Locate the table
            WebElement table = driver.findElement(By.id("form:j_idt89"));

            // Get table headings
            List<WebElement> tableHeading = table.findElements(By.xpath(".//thead//th"));
            System.out.println("Table Heading: ");
            for (WebElement theading : tableHeading) {
                System.out.print(theading.getText() + "\t");
            }
            System.out.println(); // For empty space

            // Get rows from the table body
            List<WebElement> rows = table.findElements(By.xpath(".//tbody//tr"));
            System.out.println("Table Rows: ");
            for (WebElement row : rows) {
                // Get cells in the current row
                List<WebElement> cells = row.findElements(By.xpath(".//td"));
                for (WebElement cell : cells) {
                    System.out.print(cell.getText() + "\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
