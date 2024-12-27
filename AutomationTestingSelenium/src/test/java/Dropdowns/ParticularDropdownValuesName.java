package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularDropdownValuesName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mercurytravels.co.in/");

		driver.manage().window().maximize();
		
		WebElement themesdd = driver.findElement(By.id("themes"));

		List<WebElement> themesValues = themesdd.findElements(By.tagName("option"));

		for (WebElement nameOfThemeValues : themesValues) {
			System.out.println(nameOfThemeValues.getText());
		}

		driver.close();
	}

}
