package HomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_three_method_index_value_visibleText {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");

	}

	@Test
	public void selectByIndexTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByIndex(13);
		Thread.sleep(5000);

	}

	@Test
	public void selectByValueTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByValue("20081");
		Thread.sleep(3000);
	}

	@Test
	public void selectByvisibleTest() throws InterruptedException {
		WebElement dropdownE = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdownE);
		select.selectByVisibleText("Books");
		Thread.sleep(3000);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
