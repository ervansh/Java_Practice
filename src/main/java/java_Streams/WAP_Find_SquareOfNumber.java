package java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WAP_Find_SquareOfNumber {

	public static void main(String[] args) {
		// Problem: Map a list of integers to their squares using streams.

		List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1, 9, 4);

		List<Integer> squares = numbers.stream().map(e -> e * e).collect(Collectors.toList());

		squares.forEach(System.out::println);
	}
}
