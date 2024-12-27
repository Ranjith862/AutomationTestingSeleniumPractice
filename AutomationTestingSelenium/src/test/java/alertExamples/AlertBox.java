package alertExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://leafground.com/alert.xhtml");

			driver.manage().window().maximize();

			// 1. Alert Simple Dialog:
			WebElement alertSimpleDialog = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
			// To Click alert simple dialog:
			alertSimpleDialog.click();
			// Create an Alert Interface:
			Alert alert = driver.switchTo().alert();
			// accept() is to click Ok:
			alert.accept();

			// 2. Alert Confirm Dialog:
			WebElement alertConfirmDialog = driver
					.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
			// To Click alert Confirm dialog:
			alertConfirmDialog.click();
			// Create an Alert Interface:
			Alert confirmAlert = driver.switchTo().alert();
			// dismiss() is to click Cancel:
			confirmAlert.dismiss();

			// 3. Sweet Alert:
			WebElement sweetAlert = driver
					.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]"));
			// To Click alert Confirm dialog:
			sweetAlert.click();

			// Here we write a code for Inspectable dismiss button.
			WebElement dismiss = driver.findElement(
					By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div[3]/span/button/span[2]"));
			dismiss.click();

			// 4. Sweet Model Dialog:
			WebElement sweetModelDia = driver
					.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
			// To Click alert Confirm dialog:
			sweetModelDia.click();
		
			WebElement closeButton = driver.findElement(By.xpath("//a[@aria-label='Close']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeButton);

			// 5. Alert Promt Dialog:
			WebElement alertPromt = driver
					.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
			// To Click alert Confirm dialog:
			alertPromt.click();
			// Create an Alert Interface:
			Alert promtDia = driver.switchTo().alert();
			promtDia.sendKeys("Hello Alert Promt!");
			promtDia.accept();

			// 5. Sweet Alert Confirmation:
			WebElement sweetAlertConfirm = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]"));
			// To Click alert Confirm dialog:
			sweetAlertConfirm.click();
			// Click Yes:
			WebElement yesButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt108\"]/span[2]"));
			yesButton.click();
			
			//Minimize and Maximize:
			WebElement maxmin = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]"));
			maxmin.click();
			//Create an Alert Interface:
			WebElement minimize = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/div[1]/a[3]/span"));
			minimize.click();
	
		} catch (Exception e) {
			System.out.println("Error Occured: " + e.getMessage());
		} finally {
			driver.close();
		}

	}

}
