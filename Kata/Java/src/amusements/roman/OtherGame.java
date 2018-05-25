package amusements.roman;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class OtherGame {

	static final int[] DECIMAL = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] ROMAN = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String romanNumber(int value) {
    	if(value > 4999) 
			return "value > 4999";
    	
        StringBuilder romanNumber = new StringBuilder();
        
        for (int i = 0; i < DECIMAL.length; i++) {
            int integer = value / DECIMAL[i];
            value -= DECIMAL[i] * integer;
            romanNumber.append(join("", nCopies(integer, ROMAN[i])));
        }
        return romanNumber.toString();
    }
}
