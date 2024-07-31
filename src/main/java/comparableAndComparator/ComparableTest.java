package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(12, "Mark"));
		students.add(new Student(21, "John"));
		students.add(new Student(2, "Riam"));
		students.add(new Student(-1, "Michael"));
		students.add(new Student(100, "Vansh"));
		students.add(new Student(34, "Shana"));
		students.add(new Student(91, "Rom"));

		Collections.sort(students);

		// for (Student student : students) {
		// System.out.println(student.marks);
		// System.out.println(student.names);
		// }
		// short hand with lambda expression
		// Lambda expressions are available at java 1.8 or above

		students.forEach(System.out::println);
	}
}
