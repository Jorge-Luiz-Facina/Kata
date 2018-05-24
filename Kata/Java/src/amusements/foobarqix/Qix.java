package amusements.foobarqix;

import static amusements.foobarqix.Game.QIX;
import static amusements.foobarqix.Game.SEVEN;

public class Qix implements Rule{

	@Override
	public String getValue() {
		return QIX;
	}

	@Override
	public boolean checkValue(int value) {		
		return (value % 7 == 0);
	}

	@Override
	public boolean checkContainsValue(int value) {
		return String.valueOf(value).contains(SEVEN);
	}

	@Override
	public String modifyValue(String value) {
		return value.replaceAll(SEVEN, QIX);		
	}

}
