package amusements.roman;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

import java.util.ArrayList;

import amusements.roman.number.Rule;
import amusements.roman.number.Fifty;
import amusements.roman.number.Five;
import amusements.roman.number.FiveHundred;
import amusements.roman.number.Forty;
import amusements.roman.number.Four;
import amusements.roman.number.FourHundred;
import amusements.roman.number.Hundred;
import amusements.roman.number.Nine;
import amusements.roman.number.NineHundred;
import amusements.roman.number.Ninety;
import amusements.roman.number.One;
import amusements.roman.number.Ten;
import amusements.roman.number.TenThousand;

public class Game {
	ArrayList<Rule> rule = new ArrayList<Rule>();
	
	public Game() {
		TenThousand tenThousand = new TenThousand();
		Hundred hundred = new Hundred();
		Ten ten = new Ten();
		One one = new One();
		
		NineHundred nineHundred = new NineHundred();
		FiveHundred fiveHundred = new FiveHundred();
		FourHundred fourHundred = new FourHundred();
		
		Ninety ninety = new Ninety();
		Fifty fifty = new Fifty();
		Forty forty = new Forty();
		
		Nine nine = new Nine();
		Five five = new Five();
		Four four = new Four();
		
		rule.add(tenThousand);
		
		rule.add(nineHundred);
		rule.add(fiveHundred);
		rule.add(fourHundred);
		
		rule.add(hundred);
		
		rule.add(ninety);
		rule.add(fifty);
		rule.add(forty);
		
		rule.add(ten);
		
		rule.add(nine);
		rule.add(five);
		rule.add(four);
		
		rule.add(one);
	}

	public String romanNumber(int value) {	
		if(value > 4999) 
			return "value > 4999";
		
		StringBuilder romanNumber = new StringBuilder();
		
		for(Rule rule1 : rule){
          if(rule1.checkValue(value)){
        	  int integer = value / rule1.getValue();
              value -= rule1.getValue() * integer;
              romanNumber.append(join("", nCopies(integer, rule1.getValueRoman())));
          }     
      }
		
		return romanNumber.toString();
	}
	
}
