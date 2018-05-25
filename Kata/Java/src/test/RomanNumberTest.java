package test;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import amusements.roman.OtherGame;
import amusements.roman.Game;

public class RomanNumberTest {
	OtherGame otherGame = new OtherGame();
	Game game = new Game();

	@Test
	void TestOtherGame() {
		Assert.assertEquals("LV", otherGame.romanNumber(55));
		Assert.assertEquals("MMMMCMXCIX", otherGame.romanNumber(4999));
		Assert.assertEquals("DCLVIII", otherGame.romanNumber(658));
		Assert.assertEquals("IV", otherGame.romanNumber(4));
	}
	
	@Test
	void TestGame() {
		Assert.assertEquals("LV", game.romanNumber(55));
		Assert.assertEquals("MMMMCMXCIX", game.romanNumber(4999));
		Assert.assertEquals("DCLVIII", game.romanNumber(658));
		Assert.assertEquals("IV", game.romanNumber(4));
	}
}
