package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class VerifyAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		try {
			// To open URL:
			driver.get("https://www.google.com/");

			// To Maximize the window:
			driver.manage().window().maximize();

			String expectedValue = driver.getTitle();
			System.out.println("Expected Value: " + expectedValue);
			String actualValue = "oogle";
			System.out.println("Actual Value: " + actualValue);

			String expectedUrl = driver.getCurrentUrl();
			System.out.println("Expected URL: " + expectedUrl);
			String actualUrl = "https://www.google.com/";
			System.out.println("Actual URL: " + actualUrl);

			// Verify Assertion or Soft Assertion- When we are using more multiple
			// assertions that time we use soft assertions.
			SoftAssert s = new SoftAssert();

			s.assertEquals(expectedValue, actualValue, "Not Matched");
			s.assertEquals(expectedUrl, actualUrl, "Not URL Matched");

			System.out.println("All good");

			s.assertAll();
		} catch (Exception e) {
			System.out.println("Error message: " + e.getMessage());
		} finally {
			// close browser:
			driver.close();
		}

	}

}
