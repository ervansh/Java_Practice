package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(21, "Mark"));
		students.add(new Student(21, "AJ"));
		students.add(new Student(2, "Riam"));
		students.add(new Student(-1, "Michael"));
		students.add(new Student(100, "Vansh"));
		students.add(new Student(34, "Vansh"));
		students.add(new Student(91, "Rom"));

		/*
		 * Using anonymous class
		 */
		// Collections.sort(students, new Comparator<Student>() {
		// @Override
		// public int compare(Student o1, Student o2) {
		// if (o1.names.equals(o2.names)) {
		// return o1.marks - o2.marks;
		// } else {
		// return o1.names.compareTo(o2.names);
		// }
		// }
		// });

		// /*
		// * Using lambda
		// */
		// Collections.sort(students, (Student o1, Student o2) ->{
		// if (o1.names.equals(o2.names)) {
		// return o1.marks - o2.marks;
		// } else {
		// return o1.names.compareTo(o2.names);
		// }
		// }
		// );

		/*
		 * Using lambda , you can remove class name
		 */
//		Collections.sort(students, (o1, o2) -> {
//			if (o1.names.equals(o2.names)) {
//				return o1.marks - o2.marks;
//			} else {
//				return o1.names.compareTo(o2.names);
//			}
//		});
		
		/*
		 * Using lambda, if you want to sort with name only.
		 */
//		Collections.sort(students, (o1, o2) -> o1.names.compareTo(o2.names));
		
		/*
		 * use of comparing function
		 */
		Collections.sort(students, Comparator.comparing(Student::getNames).thenComparing(Student::getMarks));
		

		// for (Student Student : students) {
		// System.out.println("Marks = " + Student.marks +" Names = "+
		// Student.names);
		// }

		// Short hand using lambda
		students.forEach(System.out::println);

	}
}
