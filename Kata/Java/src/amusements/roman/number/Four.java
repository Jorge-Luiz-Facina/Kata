package amusements.roman.number;

public class Four implements Rule{

	@Override
	public int getValue() {
		return 4;
	}

	@Override
	public String getValueRoman() {
		return "IV";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 3);
	}
}