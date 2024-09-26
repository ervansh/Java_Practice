package java_Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WAP_NonRepeating_CharactersInString {

	public static void main(String[] args) {
		// Problem- Finding the First Non-Repeated Character in a String
		
		String str = "swiss";
		
		Character chars = str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
		
		System.out.println("Non repeating character is : "+chars);
		

	}

}
