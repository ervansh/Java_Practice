package collections.mapInterface;

import java.util.Hashtable;

/**
 * Hashtable: Hashtable is a synchronized implementation of the Map interface.
 * Unlike HashMap, it does not allow null keys or null values. It offers thread
 * safety, at the expense of lower performance compared to HashMap. The
 * enumeration provided by Hashtable is not fail-fast.
 */
public class HashTablePractice {

	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
		hashtable.put(2, "Blue");
		hashtable.put(4, "Red");
		
		System.out.println(hashtable);
	}

}
