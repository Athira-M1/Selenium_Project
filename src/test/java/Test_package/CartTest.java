package Test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base_package.BaseClass;

public class CartTest extends BaseClass{
	
	@Test(priority=1)
	public void cart_verification()
	{
		cart_obj.cart_method();
	}
	
	@Test(priority=2)
	public void text_verification()
	{
		String text = cart_obj.text_method();
		Assert.assertEquals(text, "Your Cart");
	}
	
	@Test(priority=3)
	public void checkout_verification()
	{
		cart_obj.checkout_method();
	}

}
