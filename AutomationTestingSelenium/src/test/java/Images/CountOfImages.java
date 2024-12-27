package Images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.flipkart.com/");

			driver.manage().window().maximize();

			List<WebElement> countOfImages = driver.findElements(By.tagName("img"));

			System.out.println("Total Images: " + countOfImages.size());

			for (WebElement Images : countOfImages) {
				String nameOfImages = Images.getAttribute("alt");
				System.out.println("Names of the Images: " + nameOfImages);
			}
		} catch (Exception e) {
			System.out.println("Error occured.." + e.getMessage());
		} finally {
			driver.close();
		}

	}

}
