package java_Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
		
		//collect names by length
		Map<Object, List<String>> nameslength = l1.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(nameslength);
		
		//remove duplicates
		List<Integer> inputlist = Arrays.asList(1, 2, 2, 5, 2, 6, 5, 8);
		
		Set<Integer> setoutput = inputlist.stream().collect(Collectors.toSet());
		setoutput.stream().forEach(System.out::println);
		
		//counting word occurrence
		String input = "the quick brown fox and the quick blue here.";
		List<String> inputarrlist = Arrays.asList(input.split(" "));
		System.out.println(inputarrlist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
		//partition even and odd numbers
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8);
		System.out.println(numbers1.stream().collect(Collectors.partitioningBy(x-> x%2==0)));
		
		//summing values in a map
		Map<String, Integer> hmap1 = new HashMap<>();
		hmap1.put("apple", 10);
		hmap1.put("orange", 15);
		hmap1.put("kiwi", 5);
		
		System.out.println(hmap1.values().stream().collect(Collectors.summingInt(x->x)));
	//OR
		System.out.println(hmap1.values().stream().reduce(Integer::sum).get());
		
		//occurrence of the words
		String input1 = "the quick brown fox and the quick blue here.";
		System.out.println(Arrays.asList(input1.split(" ")).stream().collect(Collectors.toMap(k->k, v->1, (x,y)->x+y)));
		

	}

}
