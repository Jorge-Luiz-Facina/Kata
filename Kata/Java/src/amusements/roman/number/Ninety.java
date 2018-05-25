package amusements.roman.number;

public class Ninety implements Rule{

	@Override
	public int getValue() {
		return 90;
	}

	@Override
	public String getValueRoman() {
		return "XC";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 89);
	}
}
