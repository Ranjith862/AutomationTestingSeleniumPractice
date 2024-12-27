package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To open URL:
		driver.get("https://www.google.com/");

		// To Maximize the window:
		driver.manage().window().maximize();

		String expectedValue = driver.getTitle();
		System.out.println("Expected Value: " + expectedValue);
		String actualValue = "Google";
		System.out.println("Actual Value: " + actualValue);
		// Assert Assertion or Hard Assertion
		Assert.assertEquals(expectedValue, actualValue, "Not Matched");
		
		System.out.println("All good");
		//close browser:
		driver.close();
		

	}

}
