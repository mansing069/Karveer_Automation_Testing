package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tempp {
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "E:\\NEWGEN CORPORATE TRAINING CENTER\\web_update\\edgedriver_win32\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  //driver.get("https://karveerautomation.wixsite.com/home");
		  driver.navigate().to("https://karveerautomation.wixsite.com/home");
		  driver.manage().window().maximize();
		  
	}

}
