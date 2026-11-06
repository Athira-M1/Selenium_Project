package Test_package;

import org.testng.annotations.Test;

import Base_package.BaseClass;

public class PaymentTest extends BaseClass {
	
	@Test(priority=1)
	public void screenshot_verify() throws Exception
	{
		payment_obj.screenshot_metod();
	}
	
	@Test(priority=2)
	public void finish_verification()
	{
		payment_obj.finish_method();
	}

}
