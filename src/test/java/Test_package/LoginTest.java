package Test_package;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_package.BaseClass;

public class LoginTest extends BaseClass{
	
	@Test(priority=1)
	public void title_verification()
	{
	 String actual_title = login_obj.title_method();
	 Assert.assertEquals(actual_title, "Swag Labs");
	}
	
	
	@Test(priority =2)
	public void login_validation()
	{
		login_obj.login_method("standard_user", "secret_sauce");
		
	}
	
	
	@Test(priority=3)
	public void url_validation()
	{
		String home_url = login_obj.url_method();
		System.out.println("Home URL : "+home_url);
		// Assert.assertEquals(home_url, "https://www.saucedemo.com/inventory.html");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
	}
	

}


