package lambdaExpression;

import java.util.TreeMap;

public class MapSortingWithLambdaExpression {

	public static void main(String[] args) {
		// Natural sorting
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("Vansh", 12);
		tm.put("van", 212);
		tm.put("ansh", 102);
		tm.put("aksh", 10);
		System.out.println("Natural sorting " + tm);

		// Custom sorting
		TreeMap<Integer, String> tm1 = new TreeMap<>((I1, I2) -> {
			if (I1 < I2) {
				return +1;
			} else if (I1 > I2) {
				return -1;
			} else {
				return 0;
			}
		});
		tm1.put(12, "Vansh");
		tm1.put(212, "Van");
		tm1.put(102, "Ansh");
		tm1.put(10, "Aksh");
		System.out.println("After custom sorting : " + tm1);
	}
}
