package HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_getText_method {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(4000);
	}
	@Test (enabled = true, priority = 1)
	public void searchboxTest() throws InterruptedException {
		driver.findElement(By.id("gh-btn")).click();
		System.out.println("getTextTest");
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
		
		
	}
	
	

}
