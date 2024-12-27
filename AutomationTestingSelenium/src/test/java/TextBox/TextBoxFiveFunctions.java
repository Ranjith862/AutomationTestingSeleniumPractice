package TextBox;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxFiveFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/input.xhtml");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Type your name:
		WebElement typeYourName = driver.findElement(By.id("j_idt88:name"));
		typeYourName.sendKeys("Ranjith");

		Thread.sleep(1000);

		// Append the text:
		WebElement appendCountry = driver.findElement(By.id("j_idt88:j_idt91"));
		appendCountry.sendKeys(" in India");

		Thread.sleep(1000);

		// Verify If the textBox is Disabled:
		WebElement verifyIsDisabled = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean disabledBox = verifyIsDisabled.isEnabled();
		System.out.println(disabledBox);// If its Enabled it shows true else it shows false.

		Thread.sleep(1000);

		// Clear the values in the text box:
		WebElement clearValues = driver.findElement(By.id("j_idt88:j_idt95"));
		clearValues.clear();

		Thread.sleep(1000);

		// Retrive the values from the text box:
		WebElement retriveValues = driver.findElement(By.id("j_idt88:j_idt97"));
		String valuesFromRetrive = retriveValues.getAttribute("value");
		System.out.println(valuesFromRetrive);
        
		Thread.sleep(1000);
		
		//Type EmailId and Click Tab:
		WebElement emailid = driver.findElement(By.id("j_idt88:j_idt99"));
		emailid.sendKeys("ranjith862@gmail.com");
		emailid.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		 
		//Tell about yourself:
		WebElement tellAbtYourSelf = driver.findElement(By.id("j_idt88:j_idt101"));
		tellAbtYourSelf.sendKeys("My Name is Ranjith, Im from Madurai. I completed B.com at Sourashtra College. I have 1 year experience in Manual testing.");
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}
