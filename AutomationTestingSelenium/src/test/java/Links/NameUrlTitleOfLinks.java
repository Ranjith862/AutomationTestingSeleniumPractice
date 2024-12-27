package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameUrlTitleOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Iterate through the list of links to interact with each one.
		for (int i = 0; i < links.size(); i++) {
			// Check if the link is displayed (visible to the user).
			if (links.get(i).isDisplayed()) {
				// Get the text of the link (the visible part of the hyperlink).
				String linksname = links.get(i).getText();

				// Click on the link to navigate to the corresponding page.
				links.get(i).click();

				// Get the current URL of the page after clicking the link.
				String Url = driver.getCurrentUrl();

				// Get the title of the page after clicking the link.
				String title = driver.getTitle();

				// Print the link's text, its URL, and the title of the page.
				System.out.println(linksname + " " + Url + " " + title);

				// Navigate back to the previous page (Google homepage).
				driver.navigate().back();

				// Refresh the list of links on the page because navigating back
				// might reload the page and modify the DOM structure.
				links = driver.findElements(By.tagName("a"));

				// Pause execution for 2 seconds to ensure the page is fully loaded
				// before continuing with the next iteration.
				Thread.sleep(2000);

			}
		}

		driver.close();
	}

}
