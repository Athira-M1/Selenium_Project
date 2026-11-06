package Page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]") WebElement first_name;
	@FindBy(xpath="//*[@id=\"last-name\"]") WebElement last_name;
	@FindBy(xpath="//*[@id=\"postal-code\"]") WebElement postal_code;
	@FindBy(xpath="//*[@id=\"continue\"]") WebElement continue_button;
	
	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkout_method (String first,String last,String code)
	{
		first_name.sendKeys(first);
		last_name.sendKeys(last);
		postal_code.sendKeys(code);
		continue_button.click();
	}
	
	

}
