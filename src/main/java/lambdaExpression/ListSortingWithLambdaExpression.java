package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortingWithLambdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();

		i.add(12);
		i.add(23);
		i.add(0);
		i.add(2);

		System.out.println("List without sorting : " + i);

		Collections.sort(i); // natural sorting
		System.out.println("List after sorting : " + i);

		// custom sorting using lambda exp
		Collections.sort(i, (i1, i2) -> {
			if (i1 < i2) {
				return +1;
			} else if (i1 > i2) {
				return -1;
			} else {
				return 0;
			}
		}

		);

		System.out.println("List after custom Sorting : "+i);
	}

}
