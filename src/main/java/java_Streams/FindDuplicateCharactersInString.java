package java_Streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		String name="vanshraj";
		System.out.println(Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(c -> c.getValue()>1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
				);
	}

}
