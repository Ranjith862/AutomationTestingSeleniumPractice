package CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To open URL:
		driver.get("https://artoftesting.com/samplesiteforselenium");

		// To Maximize the window:
		driver.manage().window().maximize();

		WebElement checkbox = driver.findElement(By.xpath("//input[@class='Automation']"));

		checkbox.click();

		Thread.sleep(2000);

		if (checkbox.isSelected()) {
			System.out.println("Automation Testing is selected.");
		} else {
			System.out.println("Automation Testing is not selected.");
		}

		// To close the window:
		driver.close();

	}

}
