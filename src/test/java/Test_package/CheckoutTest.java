package Test_package;

import org.testng.annotations.Test;

import Base_package.BaseClass;

public class CheckoutTest extends BaseClass{
	
	@Test(priority=1)
	public void checkout_verification() {
		checkout_obj.checkout_method("abcd", "m", "1234");
		
	}

}
