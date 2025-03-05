package collections.mapInterface;

import java.util.TreeMap;

/**
 * TreeMap: TreeMap is implemented based on a Red-Black tree structure and
 * stores the elements in sorted order according to their natural ordering or a
 * custom Comparator provided at the map's creation time. TreeMap does not allow
 * null keys but allows multiple null values. The operations like get and put
 * take O(log n) time.
 */
public class TreeMapPractice {

	public static void main(String[] args) {

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(2, "Blue");
		treemap.put(3, "Black");

		System.out.println(treemap);
	}
}
