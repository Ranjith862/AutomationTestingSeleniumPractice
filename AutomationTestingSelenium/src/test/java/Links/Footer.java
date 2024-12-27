package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		// Footer links:
		WebElement footerlinks = driver.findElement(By.xpath("//*[@class=\"KxwPGc SSwjIe\"]"));

		// Count of the links:
		List<WebElement> countoflinks = footerlinks.findElements(By.tagName("a"));

		System.out.println(countoflinks.size());

		for (WebElement nameofheaderlinks : countoflinks) {
			System.out.println(nameofheaderlinks.getText());
		}

		driver.close();
	}

}
