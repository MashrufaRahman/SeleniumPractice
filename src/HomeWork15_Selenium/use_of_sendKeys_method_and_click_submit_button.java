package HomeWork15_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class use_of_sendKeys_method_and_click_submit_button {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	}
	// Regular way to click a submit button to search something	
	@Test (enabled=true, priority = 1)
	public void searchAProductTest() throws InterruptedException{		
		driver.findElement(By.id("//input[@id='ap_email']")).sendKeys("srahman243");
		Thread.sleep(3000);
		driver.findElement(By.id("//input[@id='continue']")).click();
		Thread.sleep(3000);
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		driver.findElement(By.id("//input[@id='ap_email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("//input[@id='ap_email']")).sendKeys("srahman243");
		Thread.sleep(3000);
		driver.findElement(By.id("//input[@id='continue']")).click();
	}
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
