package amusements;

public class CountDigit {
	public int countDigit(int n, int d) {
		char integer = String.valueOf(d).charAt(0);
		int [] listInteger = square(n);		
		return counterChar(n, listInteger, integer);	
	}
	
	private int[] square(int integer) {
		int [] listInteger = new int[integer + 1];		
		for(int i = 0; i <= integer; i++) {
			listInteger[i] = i * i;
		}
		return listInteger;
	}
	
	private int counterChar(int integer,int[] listInteger, char word) {
		int quantity = 0;
		String text;
        for (int i = 0; i <= integer; i++) {
        	text = String.valueOf(listInteger[i]);
        	quantity += quantityChar(text, word);
        } 
        return quantity;
	}
	
	private int quantityChar(String text, char word) {
		int counter = 0;
		for(int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			if(c == word)
				counter++;				
		}
        return counter; 
	}		
}
