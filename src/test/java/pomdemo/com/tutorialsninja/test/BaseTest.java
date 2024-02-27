package pomdemo.com.tutorialsninja.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.extentReport.ExtentReportUtils;


public class BaseTest {
	
  public static WebDriver driver;
	@BeforeSuite
	public void initDriver() {
		
		ExtentReportUtils.setUpReport();//need to call before running tc
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
}
