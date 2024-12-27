package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.manage().window().maximize();

		List<WebElement> countofradio = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Count of Radio Buttons: " + countofradio.size());
		System.out.println("Names of the radio buttons: ");
		for (int i = 0; i < countofradio.size(); i++) {
			System.out.println(countofradio.get(i).getAttribute("value"));
		}

		driver.close();
	}

}
