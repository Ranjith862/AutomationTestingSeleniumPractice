package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		// Header links:
		WebElement headerlinks = driver.findElement(By.id("gb"));

		// Count of the links:
		List<WebElement> countoflinks = headerlinks.findElements(By.tagName("a"));

		System.out.println(countoflinks.size());

		for (WebElement nameofheaderlinks : countoflinks) {
			System.out.println(nameofheaderlinks.getText());
		}

		driver.close();
	}

}
