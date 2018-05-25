package amusements.roman.number;

public class FiveHundred implements Rule{

	@Override
	public int getValue() {
		return 500;
	}

	@Override
	public String getValueRoman() {
		return "D";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 499);
	}
}