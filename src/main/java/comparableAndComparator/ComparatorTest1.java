package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest1 implements Comparator<Student> {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(21, "Mark"));
		students.add(new Student(21, "AJ"));
		students.add(new Student(2, "Riam"));
		students.add(new Student(-1, "Michael"));
		students.add(new Student(100, "Vansh"));
		students.add(new Student(34, "Shana"));
		students.add(new Student(91, "Rom"));

		Collections.sort(students, new ComparatorTest1());

		students.forEach(System.out::println);

		System.out.println("****************************");

		Collections.sort(students, Comparator.comparing(Student::getMarks).thenComparing(Student::getNames));
		students.forEach(System.out::println);
	}

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getNames().equals(o2.getNames())) {
			return o1.getMarks() - o2.getMarks();
		} else {
			return (o1.getNames().compareTo(o2.getNames()));
		}
	}

}
