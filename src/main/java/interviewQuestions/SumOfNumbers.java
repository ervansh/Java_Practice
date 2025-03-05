package interviewQuestions;

import java.awt.AWTException;
import java.util.stream.IntStream;

public class SumOfNumbers {

	public static void main(String[] args) throws AWTException {
		// sum of digits of a number
		int num = 123;
		int sum = 0;

		//using loop
		while (num != 0) {
			int reminder = num % 10;
			sum += reminder;
			num = num / 10;
		}
		System.out.println("Sum of digits of a number is "+sum);
	
	
		//using stream
	
	IntStream sumstream = String.valueOf(sum)
			.chars()
			.map(Character::getNumericValue);
	System.out.println(sumstream.sum());
	

	}

}
