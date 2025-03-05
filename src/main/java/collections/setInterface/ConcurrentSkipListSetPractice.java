package collections.setInterface;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * ConcurrentSkipListSet is a scalable concurrent NavigableSet implementation
 * based on ConcurrentSkipListMap. This set maintains the elements in natural
 * order or according to a Comparator and provides expected average log(n) time
 * cost per operation.
 */
public class ConcurrentSkipListSetPractice {

	public static void main(String[] args) {
		Set<String> set = new ConcurrentSkipListSet<>();
		set.add("Cherry");
		set.add("Banana");
		set.add("Apple");
		set.add("Banana");  // Duplicate, will not be added
		System.out.println(set);  // Output will be: [Apple, Banana, Cherry]
	}

}
