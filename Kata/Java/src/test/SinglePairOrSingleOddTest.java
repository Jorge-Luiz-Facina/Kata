package test;

import org.junit.jupiter.api.Test;
import amusements.SinglePairOrSingleOdd;
import org.junit.Assert;

class SinglePairOrSingleOddTest{

	@Test
	void test() {
		SinglePairOrSingleOdd test1 = new SinglePairOrSingleOdd();
		
		int[] exampleTest1 = {2,6,8,-10,3};
		int[] exampleTest2 = {9,0,1};
		int[] exampleTest3 = {5,6,8,-10,12};
		int[] exampleTest4 = {1,1,1,10,1,1,1};
		
		Assert.assertEquals(3, test1.findPairOrOdd(exampleTest1));
		Assert.assertEquals(0, test1.findPairOrOdd(exampleTest2));
		Assert.assertEquals(5, test1.findPairOrOdd(exampleTest3));
		Assert.assertEquals(10, test1.findPairOrOdd(exampleTest4));
	}
}
