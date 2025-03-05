package recursion;

public class FabonacciSeries {

	public static int fabonacci(int n) {
		// base base
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		// recursive case
		return fabonacci(n - 1) + fabonacci(n - 2);
	}

	public static void main(String[] args) {
		int num = 4;
		int result = fabonacci(num);

		System.out.println("Fabonacci of number " + num + " is " + result);
	}
}
