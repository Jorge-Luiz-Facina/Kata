package amusements.roman.number;

public class FourHundred implements Rule{

	@Override
	public int getValue() {
		return 400;
	}

	@Override
	public String getValueRoman() {
		return "CD";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 399);
	}
}
