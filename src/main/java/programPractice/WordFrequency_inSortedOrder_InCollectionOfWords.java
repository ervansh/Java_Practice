package programPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency_inSortedOrder_InCollectionOfWords {

	//Find word frequency in sorted order in a given array/collection of words.
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("vansh", "Books", "pen", "vansh", "Books", "pencil", "plants", "plants");
		
		System.out.println("Size is: "+words.size());
		
		Map<String, List<String>> result = words.stream()
		.sorted()
		.collect(Collectors.groupingBy(e -> e));
		
		System.out.println(result);
		
		result.entrySet().forEach(e -> System.out.println(e.getValue().size()));
		

	}

}
