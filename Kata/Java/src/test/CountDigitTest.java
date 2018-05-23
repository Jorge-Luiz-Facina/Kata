package test;

import org.junit.jupiter.api.Test;
import amusements.CountDigit;
import org.junit.Assert;

public class CountDigitTest {
	@Test
	void test() {
		CountDigit test1 = new CountDigit();
		
		Assert.assertEquals(9481, test1.countDigit(11011, 2));
		Assert.assertEquals(4700, test1.countDigit(5750, 0));
		Assert.assertEquals(7733, test1.countDigit(12224, 8));
		Assert.assertEquals(11905, test1.countDigit(11549, 1));
	}	
}
