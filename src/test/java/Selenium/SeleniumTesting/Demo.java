package Selenium.SeleniumTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void acountAmount() {

		BankAcaunt acount = new BankAcaunt(0);
		acount = new BankAcaunt(3333);
		Assert.assertEquals(3333, acount.getAmount(), "Your account sum mismatch");
	}
}
