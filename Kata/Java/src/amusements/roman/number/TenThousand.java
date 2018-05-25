package amusements.roman.number;

public class TenThousand implements Rule{

	@Override
	public int getValue() {
		return 1000;
	}

	@Override
	public String getValueRoman() {
		return "M";
	}

	@Override
	public boolean checkValue(int value) {
		return (value > 999);
	}
}