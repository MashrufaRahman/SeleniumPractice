package HomeWork14;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationMathod {
WebDriver driver;

@BeforeTest
public void setUp() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.bankofamerica.com/?page_msg=signoff&request_locale=en_us");
	Thread.sleep(3000);
}
@Test
public void urlTest() throws InterruptedException {
	driver.findElement(By.xpath("//a[@id='enroll']")).click();
	Thread.sleep(3000);
	
}
@AfterTest
public void tearUp() {
	driver.quit();
	
	
}


}
