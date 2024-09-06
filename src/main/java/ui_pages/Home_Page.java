package ui_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Home_Page  {
	WebDriver driver;
	
	
	public Home_Page(WebDriver driver) {
		//PageFactory.initElements(driver, this);
		this.driver = driver;
	 }

	String titleText = "";
	
	@FindBy(xpath="//h2[text()='Test login']")WebElement Login_Page;
		
	@FindBy(xpath="//input[@id='username']")WebElement User_Name;
	
	@FindBy(xpath="//input[@id='password']")WebElement Password;
	
	@FindBy(xpath="//button[@id='submit']")WebElement Submit;
	
	@FindBy(xpath="//h1[@class='post-title']")WebElement Message;
	
	@FindBy(xpath="//div[@class='show']")WebElement login_Result;
	
	@FindBy(xpath="//a[text()='Log out']")WebElement log_Out;
	
	
	
	public String getURL() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public String getPageTitle() {
		return titleText = driver.getTitle();
	}
	public String verifyLoginPage() {
		String getLoginPage = Login_Page.getText();
		return getLoginPage;
	}	
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	public void clickLoginButton() {
		Submit.click();
	}	
	public String verifyLoginResult() {
		String result = Message.getText();
		return result;
	}
	public String enterMessage() {
		String loginMessage = Message.getText();
		return loginMessage;
	}
	public void clickLogoutButton() {
		log_Out.click();
	}	

	
	
 } 
	
	
