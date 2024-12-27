package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		// To find count of the links:(findElements returns List<WebElement>)
		List<WebElement> countoflinks = driver.findElements(By.tagName("a"));

		// print the count of the links:
		System.out.println(countoflinks.size());

		// Get the text name of the links:(Using for each loop):
		for (WebElement linksname : countoflinks) {
			System.out.print(linksname.getText() + ", ");
		}

		// Get the name of the links: (Using for loop):
		/*
		 * for(int i = 0; i < countoflinks.size(); i++) {
		 * System.out.println(countoflinks.get(i).getText()); }
		 */

		driver.close();
	}

}
