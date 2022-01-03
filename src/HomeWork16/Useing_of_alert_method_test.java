package HomeWork16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*test hoveover --> moveToElement(ourLocations).build().perform(), Test an alert --> accept(), dismiss(), switchTo().alert() methods for the existing work in HW 15. Also use Firefox driver for any of them. You can also choose more than one url to see those actions. Please push it to github
 * 
 */

public class Useing_of_alert_method_test {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://play.google.com/store/apps/details?id=me.webalert&hl=en_US&gl=US");
		Thread.sleep(3000);
		
	}
	@Test(enabled = true,priority = 1)
	public void alartInstall() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Install']")).click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(alert.getText());
	alert.accept();
	
	}
	
	@Test(enabled = true, priority = 2)
	public void dismisAlertTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
			
		
	}
	
@AfterTest
public void tearUp() {
	driver.quit();
}
}
