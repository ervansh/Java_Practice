package collections.setInterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<Tree set>>>>>>>>>>>>>>>>>>");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("rahul");
		ts.add("vansh");
		ts.add("rahul");
		ts.add("rahul");
		System.out.println(ts);

		Set<String> set = new TreeSet<>();
		set.add("Cherry");
		set.add("Banana");
		set.add("Apple");
		System.out.println(set); // Output will be: [Apple, Banana, Cherry]

	}

}
