package amusements;

import java.util.HashMap;
import java.util.Map.Entry;

public class AmountCharacter {
	
	private HashMap<Character, Integer> table;
	
	public void amountAllCharacte(String text) {
		table = new HashMap<>();
		for(int i = 0; i < text.length(); i++){
			char character = text.charAt(i);
			if(table.containsKey(character))
				table.put(character, table.get(character).intValue() + 1);
			else
				table.put(character, 1);	
		}		
	}

	public int specificCharacter(String text, char character) {
		amountAllCharacte(text);
		for(Entry<Character, Integer> entry : table.entrySet()){
            if(entry.getKey().equals(character))
            	return entry.getValue(); 
		}
		return 0;		
	}
}
