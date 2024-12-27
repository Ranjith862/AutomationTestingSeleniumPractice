package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To open URL:
		driver.get("https://artoftesting.com/samplesiteforselenium");

		// To Maximize the window:
		driver.manage().window().maximize();

		List<WebElement> countofcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println("Count of CheckBoxes: " + countofcheckboxes.size());
		System.out.println("Names of the CheckBoxes: ");
		for (int i = 0; i < countofcheckboxes.size(); i++) {
			System.out.println(countofcheckboxes.get(i).getAttribute("value"));
		}

		// To close the window:
		driver.close();
	}

}
