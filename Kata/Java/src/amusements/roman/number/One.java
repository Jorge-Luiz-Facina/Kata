package amusements.roman.number;

public class One implements Rule{

	@Override
	public int getValue() {
		return 1;
	}

	@Override
	public String getValueRoman() {
		return "I";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 0);
	}
}
