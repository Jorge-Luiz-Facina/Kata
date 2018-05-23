package test;
import org.junit.jupiter.api.Test;

import static amusements.fizzbuzz.Game.FIZZ;
import static amusements.fizzbuzz.Game.BUZZ;
import static amusements.fizzbuzz.Game.FIZZBUZZ;

import org.junit.Assert;

import amusements.fizzbuzz.Game;


public class FizzBuzzTest {
	Game game = new Game();
	
	@Test
	void fizz() {
		Assert.assertEquals(FIZZ,game.fizzBuzz(3));
		Assert.assertEquals(FIZZ,game.fizzBuzz(54));
	}
	
	@Test
	void buzz() {
		Assert.assertEquals(BUZZ,game.fizzBuzz(5));
		Assert.assertEquals(BUZZ,game.fizzBuzz(25));
	}
	
	@Test
	void fizzBuzz() {
		Assert.assertEquals(FIZZBUZZ,game.fizzBuzz(15));
		Assert.assertEquals(FIZZBUZZ,game.fizzBuzz(75));
	}
	
	@Test
	void number() {
		Assert.assertEquals("1",game.fizzBuzz(1));
		Assert.assertEquals("67",game.fizzBuzz(67));
	}
}
