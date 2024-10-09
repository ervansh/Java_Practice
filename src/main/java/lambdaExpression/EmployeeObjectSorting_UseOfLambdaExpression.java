package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeObjectSorting_UseOfLambdaExpression {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("Vansh", 30));
		al.add(new Employee("John", 35));
		al.add(new Employee("Ansh", 10));
		al.add(new Employee("Ted", 51));

		System.out.println("Before sorting : \n" + al);

		// implementing custom sorting

		Collections.sort(al,

				(e1, e2) -> {
					if (e1.age < e2.age) { //sorting wrt age, we can also sort with name
						return +1;
					} else if (e1.age > e2.age) {
						return -1;
					} else {
						return 0;
					}
				});
		System.out.println("After sorting : \n" + al);
	}
}
