package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Actions {

public static WebDriver driver;


 public static WebDriver setup() {

	 System.setProperty("webdriver.edge.driver", "E:\\NEWGEN CORPORATE TRAINING CENTER\\web_update\\edgedriver_win32\\msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  //driver.get("https://karveerautomation.wixsite.com/home");
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.manage().window().maximize();
	  
	  return driver;
 }


 public void close() {
	driver.quit();
 }
	 
	
	
	
	
	
}
