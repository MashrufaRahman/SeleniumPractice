package HomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfHoveoverAndAlertTest {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}

	@Test
	public void mouseHoveoverActionOnMyEbay() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement myEbay = driver
				.findElement(By.xpath("//a[contains(text(), 'My eBay') and @class='gh-eb-li-a gh-rvi-menu']"));
		actions.moveToElement(myEbay).build().perform();
		Thread.sleep(3000);
		System.out.println("\nThe text of this webEliment is:" + myEbay.getText());

	}

	@Test(enabled = true, priority = 1)
	public void alertFromWindow() {

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
