package comparableAndComparator;

import java.util.Comparator;

public class ComparatorUseCase implements Comparator<Student>{
//sort by name then mark
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.names.equals(o2.names)) {
			return o1.marks - o2.marks;
		}
		else {
			return o1.names.compareTo(o2.names);
		}
	}
	
	

}
