package Test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_package.BaseClass;

public class HomeTest extends BaseClass {
	
	@Test(priority=1)
	public void text_verification()
	{
		// login_obj.login_method("standard_user", "secret_sauce");  // calls login_method in Loginpage before executing home page methods
		String product_text = home_obj.text_method();
		Assert.assertEquals(product_text, "Products");
	}
	
	@Test(priority=2)
	public void link_verification()
	{
		int link_count = home_obj.link_method();
		System.out.println("Number of Links : "+link_count);
	}
	
	@Test(priority=3)
	public void cart_verification()
	{
		home_obj.cart_method();
	}
	
	

}
