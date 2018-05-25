package amusements;

public class Factorial {

	public int factorial(int n) {
		return (n < 2) ? n : factorial(n - 1) * n;
	}
}
