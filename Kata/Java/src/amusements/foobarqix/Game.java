package amusements.foobarqix;

import java.util.ArrayList;


public class Game {

	final static String THREE = "3";
	final static String FOO = "Foo";
	
	final static String FIVE = "5";
	final static String BAR = "Bar";
	
	final static String SEVEN = "7";
	final static String QIX = "Qix";
	
	ArrayList<Rule> rule = new ArrayList<Rule>();
	
	public Game() {
		Foo foo = new Foo();
		Bar bar = new Bar();
		Qix qix = new Qix();
		
		rule.add(foo);
		rule.add(bar);
		rule.add(qix);	
	}
	
	public String fooBarQix(int value) {
		String fooBarQix = getDivisableRule(value) + getContainsRule(value);		
		if(divisableRule(value) || containsRule(value)) 
			fooBarQix = clearNumber(fooBarQix);

		return containsCharSpecial(fooBarQix);		
	}
	
	public boolean divisableRule(int value){
        for(Rule rule1 : rule){
            if(rule1.checkValue(value))
            	return true;     
        }
        return false;    
    }
	
	public boolean containsRule(int value) {		
		for(Rule rule1 : rule){
            if(rule1.checkContainsValue(value))                
                return true;                 
        }
		return false;
	}
	
	
	public String getDivisableRule(int value){
		String divisable = "";
        for(Rule rule1 : rule){
            if(rule1.checkValue(value))
            	divisable += rule1.getValue();     
        }
        return divisable;    
    }
	
	public String getContainsRule(int value) {
		String contains = String.valueOf(value);
		for(Rule rule1 : rule){
            if(rule1.checkContainsValue(value))
                contains = rule1.modifyValue(contains);     
        }
		return contains;
	}
		
	public String clearNumber(String value) {
		return value.replaceAll("[1-9]", "");
	}
	
	public String containsCharSpecial(String value) {
		return value.replaceAll("0", "*");
	}
	
}
