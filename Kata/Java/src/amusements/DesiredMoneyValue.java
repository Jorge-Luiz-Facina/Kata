package amusements;

public class DesiredMoneyValue {

	public  int calculateYears(double principal, double interest,  double taxRate, double desired) {
		int years = 0;
		while(desired > principal) {
			double interestResult = interestRate(interest, principal);
		    principal = principal + taxRate(interestResult, taxRate);
		    years++;
		}
		
	    return years;
	  }
	public double interestRate(double interest, double principal) {
		return interest * principal;
	}
	
	public double taxRate(double interestResult, double taxRate) {
		return interestResult - (interestResult * taxRate);
	}
}
