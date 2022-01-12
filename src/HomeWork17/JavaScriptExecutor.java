package HomeWork17;

import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
/*
 * Use headless browser to run method of any URL. use javascriptExecutor for click and sendKeys similar for selenium webdriver, use implicitly wait, if possible use Assert, SoftAssert etc. You can also choose more than one url to see those actions. Please push it to github
 */
import org.testng.annotations.Test;
public class JavaScriptExecutor {

WebDriver driver;
 
 @BeforeTest
 public void setUp() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
 driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.get("https://www.amazon.com/");
 Thread.sleep(3000);
  
 }
  @Test(enabled = true, priority = 1)
  public void searchAProductTest() throws InterruptedException {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphone");
	  Thread.sleep(3000);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(3000);
	  System.out.println("Current URL is" +driver.getCurrentUrl());
	  driver.findElement(By.id("twotabsearchtextbox")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
	  Thread.sleep(3000);
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("twotabsearchtextbox"));
	  Thread.sleep(3000);
	  
	  	  
  }
	  
 @AfterTest
 public void tearup() {
	 driver.quit();
 }
		
	}
	

