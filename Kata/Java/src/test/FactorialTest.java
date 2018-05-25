package test;
import org.junit.jupiter.api.Test;
import amusements.Factorial;
import org.junit.Assert;
public class FactorialTest {
	Factorial factorial = new Factorial();
	
	@Test
	void test() {
		Assert.assertEquals(2, factorial.factorial(2));
		Assert.assertEquals(6, factorial.factorial(3));
		Assert.assertEquals(40320, factorial.factorial(8));
		Assert.assertEquals(362880, factorial.factorial(9));		
	}

}
