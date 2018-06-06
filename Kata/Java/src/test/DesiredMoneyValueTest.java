package test;

import org.junit.jupiter.api.Test;
import amusements.DesiredMoneyValue;
import org.junit.Assert;
public class DesiredMoneyValueTest {
	DesiredMoneyValue desiredMoneyValue = new DesiredMoneyValue();
	 @Test
	    public void test() {
	        Assert.assertEquals(3, desiredMoneyValue.calculateYears(1000,0.05,0.18,1100));
	        Assert.assertEquals(14 , desiredMoneyValue.calculateYears(1000,0.01625,0.18,1200));
	        Assert.assertEquals(0, desiredMoneyValue.calculateYears(1000,0.05,0.18,1000));
	    }

}
