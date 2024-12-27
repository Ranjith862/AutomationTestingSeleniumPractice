package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectParticularValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.mercurytravels.co.in/");

		driver.manage().window().maximize();

		WebElement themes = driver.findElement(By.id("themes"));

		// Create an Object for Select class, It experts WebElement inside the Select
		// Constructor.
		Select select = new Select(themes);
		Thread.sleep(2000);
		// Select by Index:
		select.selectByIndex(1);
		Thread.sleep(2000);
		// Select by Visible Text:
		select.selectByVisibleText("Luxury");
		Thread.sleep(2000);
		// Select by Values:
		select.selectByValue("22");

		driver.close();
	}

}
