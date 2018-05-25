package amusements.roman.number;

public class NineHundred implements Rule{

	@Override
	public int getValue() {
		return 900;
	}

	@Override
	public String getValueRoman() {
		return "CM";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 899);
	}
}