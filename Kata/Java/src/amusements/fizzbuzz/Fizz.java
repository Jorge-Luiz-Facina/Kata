package amusements.fizzbuzz;
import static amusements.fizzbuzz.Game.FIZZ;

public class Fizz implements Rule{

	@Override
	public String getValue() {
		return FIZZ;
	}

	@Override
	public boolean checkValue(int value) {	
		return (value % 3 == 0);
	}
}
