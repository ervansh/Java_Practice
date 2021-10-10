package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUsingAnonymousClass {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(21, "Mark"));
		students.add(new Student(21, "AJ"));
		students.add(new Student(2, "Riam"));
		students.add(new Student(-1, "Michael"));
		students.add(new Student(100, "Vansh"));
		students.add(new Student(34, "Shana"));
		students.add(new Student(91, "Rom"));
		
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.names.equals(o2.names)) {
					return o1.marks - o2.marks;
				}else {
					return o1.names.compareTo(o2.names);
				}
			}
		});
		
//		for (Student_Comparable student_Comparable : students) {
//			System.out.println("Marks = " + student_Comparable.marks +" Names = "+ student_Comparable.names);
//		}
		
		//Short hand using lambda
		students.forEach(System.out::println);
		
	}
}
