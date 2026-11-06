package Page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a") WebElement cart_icon;
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span") WebElement cart_text;
	@FindBy(xpath="//*[@id=\"checkout\"]") WebElement checkout_button;
	
	public CartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void cart_method()
	{
		cart_icon.click();
	}
	
	public String text_method()
	{
		String actual_text= cart_text.getText();
		return actual_text;
	}
	
	public void checkout_method()
	{
		checkout_button.click();
	}
	

}
