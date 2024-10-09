package java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP_FindEven_OddNumbers_fromListOfIntegers {

	public static void main(String[] args) {
		// Problem: Partition a list of integers into even and odd numbers using
		// streams.

		List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1, 9, 4);

		Map<Boolean, List<Integer>> even = numbers.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0));

		System.out.println(
				"Even numbers will be returned for true conditions, \n so even numbers are : " + even.get(true));
		System.out.println("Odd numbers are : " + even.get(false));
	}
}
