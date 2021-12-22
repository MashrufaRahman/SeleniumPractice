package HomeWork13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateMethodToRunAnUrl {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walmart.com/");
		Thread.sleep(4000);
	}

	@Test
	public void urlTest() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='center flex items-center justify-center pa4']")).click();
		Thread.sleep(4000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
