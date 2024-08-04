package java_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations_Part2 {

	public static void main(String[] args) {
		// Program-1, WAP to find all the numbers that are starting with 1

		List<Integer> num = Arrays.asList(1, 3, 54, 13, 4, 123, 91, 2, 10, 111, 6);
		List<Integer> filterednumbers = num.stream().filter(n -> String.valueOf(n).startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("Numbers starting with 1 are : " + filterednumbers);
		// you can print like below as well
		filterednumbers.forEach(System.out::println);
		System.out.println("\n");

		// Program-2, WAP to group the names by first letter of the name and then count
		// the names in each group
		String[] names = { "Van", "Vansh", "Books", "Ball", "pen", "Basket" };
		Map<Character, Long> groupednames = Arrays.stream(names)
				.collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
		System.out.println(groupednames);
		System.out.println("\n");

		// Program-3, WAP to find duplicates in an array
		int[] numbers = { 2, 4, 2, 5, 3, 4, 5, 5, 5, 3, 1 };
		Map<Integer, Long> nummm = Arrays.stream(numbers).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		nummm.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey)
				.forEach(System.out::println);
		System.out.println("\n");

		// Program-4, WAP to sort list of strings according to the increasing order of
		// length.
		// String[] sortlen = { "Van", "Vansh", "Books", "Ball", "pen", "Basket" };
		List<String> namelist = Arrays.asList(names);
		namelist.stream().sorted(Comparator.comparingInt(e -> e.length())).forEach(e -> System.out.println(e));
		//or you can also write same statement as below
		System.out.println("\n");
		namelist.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
		
		//WAP to count the occurrence of any string in a given sentence
		String[] occ = {"Vansh", "Books", "Pen", "Cover", "Pencil", "Books"};
		Map<Object, List<String>> dups = Arrays.stream(occ).collect(Collectors.groupingBy(e->e));
		System.out.println("\n"+dups);
		dups.entrySet().forEach(e-> System.out.println(e.getKey() +"....count is : "+ e.getValue().size()));
	}

}
