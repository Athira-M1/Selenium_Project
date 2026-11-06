package Page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"user-name\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]") WebElement login_button;
	
	public LoginPage(WebDriver driver)  // constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Methods
	public String title_method()
	{
		String title =driver.getTitle();
		return title;
	}
	
	public void login_method(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login_button.click();
	}
	
	
	public String url_method()
	{
		String actual_url = driver.getCurrentUrl();
		return actual_url;
	}

}

