package amusements.roman.number;

public interface Rule {
	
	public abstract int getValue();
	
	public abstract String getValueRoman();
    
    public  abstract boolean checkValue(int value);
}
