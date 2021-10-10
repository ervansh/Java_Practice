package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(21, "Mark"));
		students.add(new Student(21, "AJ"));
		students.add(new Student(2, "Riam"));
		students.add(new Student(-1, "Michael"));
		students.add(new Student(100, "Vansh"));
		students.add(new Student(34, "Shana"));
		students.add(new Student(91, "Rom"));
		
		Collections.sort(students, new ComparatorUseCase());
		
		students.forEach(System.out::println);
	}
}
