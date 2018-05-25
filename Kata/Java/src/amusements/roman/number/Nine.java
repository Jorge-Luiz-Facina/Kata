package amusements.roman.number;

public class Nine implements Rule{

	@Override
	public int getValue() {
		return 9;
	}

	@Override
	public String getValueRoman() {
		return "IX";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 8);
	}
}
