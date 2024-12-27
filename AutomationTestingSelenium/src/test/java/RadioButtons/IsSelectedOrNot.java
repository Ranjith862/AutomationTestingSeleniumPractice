package RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open the target URL
		driver.get("https://artoftesting.com/samplesiteforselenium");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Locate the radio button element by ID
		WebElement Maleradiobutton = driver.findElement(By.id("male"));

		// Click the radio button to select it
		Maleradiobutton.click();

		Thread.sleep(2000);
		// Verify if the radio button is selected
		if (Maleradiobutton.isSelected()) {
			System.out.println("Male is Selected!");
		} else {
			System.out.println("Male is not selected!");
		}

		// Close the WebDriver to clean up resources
		driver.quit();

	}

}
