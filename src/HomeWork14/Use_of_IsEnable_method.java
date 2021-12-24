package HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_IsEnable_method {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bestbuy.com/site/misc/financing-rewards/pcmcat102500050032.c?id=pcmcat102500050032");
		Thread.sleep(3000);
	}
	@Test (enabled = true, priority = 1)
	public void searchboxTest() throws InterruptedException {
		boolean searchbuttonenable = driver.findElement(By.id("gh-search-input")).isEnabled();
		System.out.println("Is the logo displayed? Ans: "+searchbuttonenable);
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
		
		
	}
	
	

}
