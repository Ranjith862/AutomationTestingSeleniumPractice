package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mercurytravels.co.in/");

		driver.manage().window().maximize();

		List<WebElement> countOfDropdowns = driver.findElements(By.tagName("select"));

		System.out.println(countOfDropdowns.size());
		
		//To Get All Dropdown names:

		for (WebElement nameOfDropdows : countOfDropdowns) {
			System.out.println(nameOfDropdows.getText());
		}

		driver.close();

	}

}
