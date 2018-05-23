package amusements.fizzbuzz;

import static amusements.fizzbuzz.Game.FIZZBUZZ;

public class FizzBuzz implements Rule{

	@Override
	public String getValue() {
		return FIZZBUZZ;
	}

	@Override
	public boolean checkValue(int value) {
		return (value % 15 == 0);
	}

}
