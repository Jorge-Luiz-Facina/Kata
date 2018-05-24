package amusements.foobarqix;

import static amusements.foobarqix.Game.FOO;
import static amusements.foobarqix.Game.THREE;

public class Foo implements Rule{

	@Override
	public String getValue() {
		return FOO;
	}

	@Override
	public boolean checkValue(int value) {		
		return (value % 3 == 0);
	}

	@Override
	public boolean checkContainsValue(int value) {
		return String.valueOf(value).contains(THREE);
	}

	@Override
	public String modifyValue(String value) {
		return value.replaceAll(THREE, FOO);		
	}

}
