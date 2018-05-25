package amusements.roman.number;

public class Fifty implements Rule{

	@Override
	public int getValue() {
		return 50;
	}

	@Override
	public String getValueRoman() {
		return "L";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 49);
	}
}
