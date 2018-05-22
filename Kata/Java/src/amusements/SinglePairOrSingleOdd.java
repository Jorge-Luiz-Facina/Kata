package amusements;

public class SinglePairOrSingleOdd {
	public int findPairOrOdd(int[] integers) {
		int incrementOdd = 0;
		int incrementPair = 0;
		int i = 0;
		int integerPair = 0;
		int integerOdd = 0;
		
		while((incrementOdd < 2 || incrementPair < 1) && (incrementPair < 2 || incrementOdd < 1)) {
			if(odd(integers[i])) {
				incrementOdd++;
				integerOdd = integers[i];
			}else {
				incrementPair++;
				integerPair = integers[i];
			}
			i++;
		}
		return (incrementOdd == 1) ? integerOdd : integerPair;
	}
	
	private boolean odd(int integer) {
		return(integer % 2 == 1);
	}
}
