package HomeWork17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
/*
 *  Use headless browser to run method of any URL. use javascriptExecutor for click and sendKeys similar for selenium webdriver, use implicitly wait, if possible use Assert, SoftAssert etc. You can also choose more than one url to see those actions. Please push it to github
 */
public class HeadLessBrower {
	WebDriver driver;
	
	@BeforeTest
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(3000);
		System.out.println("The current URL is:"+driver.getCurrentUrl());
		driver.quit();
		
		
	}
	

}
