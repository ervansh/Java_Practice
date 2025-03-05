package collections.mapInterface;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * HashMap: HashMap is one of the most commonly used implementations of the Map interface. 
 * It provides constant-time performance for basic operations like get and put, 
 * assuming the hash function disperses the elements properly among the buckets. 
 * It allows one null key and multiple null values. The order of the elements is not guaranteed to be maintained.
 * 
 */
public class HashMapPractice {

	// Write a program to count characters in a given string

	public static void main(String[] args) {
		String input = "aabcbdadcbbbcdd";

		Map<Character, Integer> map = new HashMap<>();

		char[] arr = input.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		// obtain count
		for (Map.Entry<Character, Integer> data : map.entrySet()) {
			System.out.println("Character :" + data.getKey() + " is " + data.getValue() + " time(s).");
		}
	}
}
