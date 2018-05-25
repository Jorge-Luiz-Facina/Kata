package test;
import org.junit.jupiter.api.Test;
import amusements.Fibonacci;
import org.junit.Assert;

public class FibonacciTest {
	Fibonacci fibonacci = new Fibonacci();
	
	@Test
	void test() {
		Assert.assertEquals(55, fibonacci.fibonacci(10));
		Assert.assertEquals(3524578, fibonacci.fibonacci(33));
		Assert.assertEquals(13, fibonacci.fibonacci(7));
		Assert.assertEquals(1, fibonacci.fibonacci(1));
	}
	
}
