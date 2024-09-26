package java_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WAP_Find_Max_Min {

	public static void main(String[] args) {
		// Problem: Find the maximum and minimum element in a list of integers using
		// streams.

		List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 1, 9, 4);

		Optional<Integer> max = numbers.stream().max(Integer::compareTo);

		// System.out.println(max); or
		max.ifPresent(e -> System.out.println(e));

		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		min.ifPresent(e -> System.out.println(e));

	}

}
