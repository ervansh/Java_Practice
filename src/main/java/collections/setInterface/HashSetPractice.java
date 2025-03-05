package collections.setInterface;

import java.util.HashSet;
import java.util.Optional;

/**
 * HashSet: HashSet is one of the most commonly used implementations of the Set
 * interface. It uses a HashMap internally to store its elements. The elements
 * are not ordered, and the insertion order is not preserved. The operations
 * like add, remove, and contains have constant-time performance assuming the
 * hash function disperses the elements properly among the buckets.
 */
public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); // Duplicate, will not be added
		System.out.println(set); // Output might be: [Banana, Cherry, Apple]

		System.out.println("Size of hashset is : " + set.size());

		Optional<String> a = set.stream().findFirst();
		a.ifPresent(t -> System.out.println(t));
	}

}
