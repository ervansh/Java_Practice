package collections.setInterface;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet maintains the insertion order of elements. It is implemented as
 * a hash table with a linked list running through it, thus providing the order
 * of insertion. Performance-wise, it is slightly slower than HashSet due to the
 * additional cost of maintaining the linked list.
 */
public class LinkedHashSetPractice {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");  // Duplicate, will not be added
		System.out.println(set);  // Output will be: [Apple, Banana, Cherry]

	}

}
