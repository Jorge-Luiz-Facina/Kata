package test;

import org.junit.jupiter.api.Test;
import amusements.AmountCharacter;
import org.junit.Assert;

public class AmountCharacterTest {

	AmountCharacter amountCharacter = new AmountCharacter();
	@Test
	void test() {
		
		Assert.assertEquals(1, amountCharacter.specificCharacter("MainDuelo", 'n'));
		Assert.assertEquals(2, amountCharacter.specificCharacter("The duel should never stop", 'o'));
		Assert.assertEquals(4, amountCharacter.specificCharacter("Every time it's time to duel", 'e'));
		Assert.assertEquals(1, amountCharacter.specificCharacter("Every time it's time to duel", 'E'));
	}
}
