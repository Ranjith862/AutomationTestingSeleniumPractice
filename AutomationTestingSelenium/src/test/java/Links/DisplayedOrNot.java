package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		// To find count of the links:(findElements returns List<WebElement>)
		List<WebElement> countoflinks = driver.findElements(By.tagName("a"));

		int displayedlinks = 0;

		// Using for loop to find visible and non visible links:
		for (int i = 0; i < countoflinks.size(); i++) {
			if (countoflinks.get(i).isDisplayed()) {
				displayedlinks++;
			}
		}

		// Formula = Total links - visible links = not visible links:
		System.out.println("Total Links: " + countoflinks.size());

		System.out.println("Visible Links: " + displayedlinks);

		System.out.println("Not Visible Links: " + (countoflinks.size() - displayedlinks));

		driver.close();
	}

}
