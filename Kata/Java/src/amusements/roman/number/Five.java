package amusements.roman.number;

public class Five implements Rule{

	@Override
	public int getValue() {
		return 5;
	}

	@Override
	public String getValueRoman() {
		return "V";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 4);
	}
}