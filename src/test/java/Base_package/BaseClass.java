package Base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Page_package.CartPage;
import Page_package.CheckoutPage;
import Page_package.HomePage;
import Page_package.LoginPage;
import Page_package.PaymentPage;

public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage login_obj;
	public HomePage home_obj;
	public CartPage cart_obj;
	public CheckoutPage checkout_obj;
	public PaymentPage payment_obj;
	
	@BeforeTest
	public void browser_setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void object_method()
	{
		login_obj = new LoginPage(driver);
		home_obj = new HomePage(driver);
		cart_obj = new CartPage(driver);
		checkout_obj = new CheckoutPage(driver);
		payment_obj = new PaymentPage(driver);
	}
	

}




