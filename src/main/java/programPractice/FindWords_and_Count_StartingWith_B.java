package programPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords_and_Count_StartingWith_B {
	/**
	 * Find Words those starts with B and print counts from a given list..
	 * 
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bharath", "Vansh", "Vansh", "Morning", "Morning", "Bank", "Bharath");

		long count = list.stream().filter(e -> e.startsWith("B")).count();
		System.out.println("Simple count of the name that starts with B is : " + count);

		Map<String, Integer> hm = new HashMap<String, Integer>();

		for (String string : list) {
			if (string.startsWith("B")) {
				hm.put(string, hm.getOrDefault(string, 0) + 1);
			}
		}

		hm.forEach((k, v) -> System.out.println("Name : " + k + " " + "name count is " + v));
	}

}
