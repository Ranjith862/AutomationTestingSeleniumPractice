package BoldAndSmallLetters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextIsBoldOrNot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// To open targeted URL:
		driver.get("https://demo.guru99.com/test/newtours/");

		// To Maximize the window:
		driver.manage().window().maximize();

		WebElement Verifytext = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font/b"));

		Thread.sleep(1000);

		String Expected = "b";
		String Actual = Verifytext.getTagName();

		if (Expected.equals(Actual)) {
			System.out.println("Bold text");
		} else {
			System.out.println("Normal text");
		}

		driver.close();
	}

}
