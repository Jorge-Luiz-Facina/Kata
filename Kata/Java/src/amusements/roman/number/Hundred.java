package amusements.roman.number;

public class Hundred implements Rule{

	@Override
	public int getValue() {
		return 100;
	}

	@Override
	public String getValueRoman() {
		return "C";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 99);
	}
}