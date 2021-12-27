package HomeWork15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Use_of_clear_keys_enter_method {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(
				"https://www.bestbuy.com/site/searchpage.jsp?st=laptop&_dyncharset=UTF-8&_dynSessConf=&id=pcat17071&type=page&sc=Global&cp=1&nrp=&sp=&qp=&list=n&af=true&iht=y&usc=All+Categories&ks=960&keys=keys");
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 1)
	public void sendKeysBackForwardAndRefreshTest() throws InterruptedException {
		driver.findElement(By.id("gh-search-input")).sendKeys("Laptop KeysEnter");
		Thread.sleep(3000);
		driver.navigate().to("https://oldnavy.gap.com/?ssiteID=ON");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@Test(enabled = true, priority = 2)

	public void clear_maximize_and_getSize_test() throws InterruptedException {
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clothes");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("The size of window:" + driver.manage().window().getSize());
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 3)
	public void setSize_and_dimension_Test() throws InterruptedException {
		driver.get("https://www.bestbuy.com/");
		Dimension dimension = new Dimension(400, 500);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();

	}

}
