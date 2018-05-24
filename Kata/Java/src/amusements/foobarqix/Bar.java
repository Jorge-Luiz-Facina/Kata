package amusements.foobarqix;

import static amusements.foobarqix.Game.BAR;
import static amusements.foobarqix.Game.FIVE;;

public class Bar implements Rule{

	@Override
	public String getValue() {
		return BAR;
	}

	@Override
	public boolean checkValue(int value) {		
		return (value % 5 == 0);
	}

	@Override
	public boolean checkContainsValue(int value) {
		return String.valueOf(value).contains(FIVE);
	}

	@Override
	public String modifyValue(String value) {
		return value.replaceAll(FIVE, BAR);		
	}

}
