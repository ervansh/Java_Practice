package recursion;

public class FactorialUsingRecursion {

	public static int factorial(int n) {
		// base case
		if (n == 1) {
			return 1;
		}
		// recursive case
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		int result = factorial(num);
		System.out.println("Factorial of " + num + " is " + result);
	}

}
