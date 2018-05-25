package amusements.roman.number;

public class Ten implements Rule{

	@Override
	public int getValue() {
		return 10;
	}

	@Override
	public String getValueRoman() {
		return "X";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 9);
	}
}
