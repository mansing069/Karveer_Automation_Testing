package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui_pages.Home_Page;

import selenium.Selenium_Actions;

public class TestCase_01 {
	WebDriver driver = Selenium_Actions.setup();
	Home_Page homePage = PageFactory.initElements(driver, Home_Page.class);

  @Test(priority=1)
  public void verifyURL() {
		String actURL = homePage.getURL();
		String expURL = "https://practicetestautomation.com/practice-test-login/";
		Assert.assertEquals(actURL, expURL);
  }
  
  @Test(priority=3)
  public void verify_loginPage() {
		String actText = homePage.verifyLoginPage();
		String expText = "Test login";
		Assert.assertEquals(actText, expText);
  }
  
  @Test(priority=2)
  public void getTitle() {
		String actTitle = homePage.getPageTitle();
		String expTitle = "Test Login | Practice Test Automation";
		Assert.assertEquals(actTitle, expTitle);
  }
  
  
  @Test(priority=4)
  public void fillForm() throws InterruptedException {
	    //homePage.clickEnquiryFormButton();
		homePage.enterUserName("student");
		homePage.enterPassword("Password123");
		Thread.sleep(2000);
		homePage.clickLoginButton();
  }
  
  @Test(priority=5)
  public void verifyLogin() {
		String actLoginResult = homePage.verifyLoginResult();
		String expLoginResult = "Logged In Successfully";
		Assert.assertEquals(actLoginResult, expLoginResult);
  }
 
  
  
  
  
  
  
}
