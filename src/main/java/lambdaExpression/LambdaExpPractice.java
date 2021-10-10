package lambdaExpression;

import java.util.ArrayList;

public class LambdaExpPractice {

	/*
	 * 
	 * Lambda expression-- 
	 * Parameter -> expression 
	 * (pram1, param2) -> exp
	 * 
	 * () -> { //Body of no parameter lambda } 
	 * 	(p1,p2) -> { //Body of multiple
	 * parameter lambda }
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		// numbers.forEach((n) -> {System.out.println(n);});
		// or
		numbers.forEach(System.out::println);
	}
}
