package test;

import org.junit.jupiter.api.Test;
import amusements.foobarqix.Game;


import org.junit.Assert;
public class FooBarQixTest {
	Game game = new Game();
	
	@Test
	void test() {
		Assert.assertEquals("BarFoo", game.fooBarQix(53));
		Assert.assertEquals("FooFoo", game.fooBarQix(3));
		Assert.assertEquals("1*1", game.fooBarQix(101));
		Assert.assertEquals("FooBarQix*Bar", game.fooBarQix(105));
		Assert.assertEquals("FooQix**", game.fooBarQix(10101));
		Assert.assertEquals("8", game.fooBarQix(8));
	}
}
