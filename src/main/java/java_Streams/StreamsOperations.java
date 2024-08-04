package java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {

	public static void main(String[] args) {

		// Given array
		Integer[] nums = { 12, 5, 5, 23, 9, 456, 67 };
		List<Integer> list = Arrays.asList(nums);

		// print all the numbers
		list.stream().forEach(e -> System.out.println(e));

		// Find the sum of the given array
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of given array is :" + sum);

		// Find MAX of the given array
		Integer max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max of given array is :" + max);

		// count the number of strings that starts with a specific character in a given
		// list of string.
		List<String> liststring = Arrays.asList("Vansh", "Books", "Pen", "Cover", "Pencil", "Books");
		long count = liststring.stream().filter(ls -> ls.startsWith("B")).count();
		System.out.println("Count is :" + count);

		// convert above given liststring elements to upper case and print them in
		// sorted order
		liststring.stream().map(String::toUpperCase).sorted().forEach(s -> System.out.println(s));

		// for a given number of integers, filter out even numbers using streams
		list.stream().filter(num -> num % 2 == 0).forEach(e -> System.out.println("Even numbers are : " + e));

		// Count the numbers
		long countofevennumb = list.stream().filter(num -> num % 2 == 0).count();
		System.out.println("Count of even numbers : " + countofevennumb);

		// WAP to find average of floating numbers.
		List<Double> floatnum = Arrays.asList(1.2, 45.4, 3.6, 8.9, 12.0);
		double avg = floatnum.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
		System.out.println("Average is : " + avg);

		// WAP to concatenate all the given strings
		String constring = liststring.stream().collect(Collectors.joining());
		System.out.println("Concatenated string is : " + constring);

		// remove duplicate elements from the list
		list.stream().distinct().forEach(e -> System.out.println(e));

	}

}
