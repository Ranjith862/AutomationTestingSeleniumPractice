package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sequence {
      
	@BeforeTest
	public void wakeup() {
		System.out.println("Wake Up");
	}
	
	@Test
	public void brush() {
		System.out.println("Brushing");
	}
	
	@Test(priority = 1)
	public void breakFast() {
		System.out.println("BreakFast: Poori");
	}
	
	@Test(priority = 2)
	public void lunch() {
		System.out.println("Lunch: Biryani");
	}
	
	@Test(priority = 3)
	public void dinner() {
		System.out.println("Dinner: Dossa");
	}
	
	@AfterTest
	public void sleep() {
		System.out.println("Going to Sleep");
	}
}
