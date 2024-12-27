package BoldAndSmallLetters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfNrmalAndBoldText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To open targeted URL:
		driver.get("https://demo.guru99.com/test/newtours/");

		// To Maximize the window:
		driver.manage().window().maximize();

		List<WebElement> boldtxt = driver.findElements(By.tagName("b"));

		System.out.println("Bold Text: " + boldtxt.size());

		List<WebElement> nrmaltxt = driver.findElements(By.tagName("p"));

		System.out.println("Normal Text: " + nrmaltxt.size());

		// To close the window:
		driver.close();
	}

}
