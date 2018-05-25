package amusements.roman.number;

public class Forty implements Rule{

	@Override
	public int getValue() {
		return 40;
	}

	@Override
	public String getValueRoman() {
		return "XL";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 39);
	}
}