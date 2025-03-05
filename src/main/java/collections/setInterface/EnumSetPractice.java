package collections.setInterface;

import java.util.EnumSet;
import java.util.Set;

/**
 * EnumSet is a specialized Set implementation for use with enum type elements.
 * All of the elements in an EnumSet must come from a single enum type that is
 * specified when the set is created. EnumSet is represented internally as a bit
 * vector, which makes it extremely efficient.
 */
public class EnumSetPractice {
	enum Fruit {
		APPLE, BANANA, CHERRY
	}

	public static void main(String[] args) {
		Set<Fruit> set = EnumSet.noneOf(Fruit.class);
		set.add(Fruit.APPLE);
		set.add(Fruit.CHERRY);
		System.out.println(set); // Output will be: [APPLE, CHERRY]
	}

}
