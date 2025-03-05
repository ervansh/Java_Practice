package collections.mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap: LinkedHashMap maintains the insertion order of elements,
 * meaning the order in which keys were inserted into the map. It offers
 * slightly lower performance than HashMap, due to the additional overhead of
 * maintaining the order. Just like HashMap, it allows one null key and multiple
 * null values.
 */
public class LinkedHashMapPractice {

	public static void main(String[] args) {

		Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		linkedhashmap.put(1, "Blue");
		
		System.out.println(linkedhashmap.get(1));

	}
}
