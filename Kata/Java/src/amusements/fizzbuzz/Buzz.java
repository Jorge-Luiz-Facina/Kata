package amusements.fizzbuzz;
import static amusements.fizzbuzz.Game.BUZZ;

public class Buzz implements Rule{

	@Override
	public String getValue() {
		return BUZZ;
	}

	@Override
	public boolean checkValue(int value) {		
		return (value % 5 == 0);
	}
}
