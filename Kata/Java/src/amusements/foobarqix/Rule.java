package amusements.foobarqix;

public interface Rule {
	
	public abstract String getValue();
	
	public abstract String modifyValue(String value);
    
    public  abstract boolean checkValue(int value);
    
    public  abstract boolean checkContainsValue(int value);
}
