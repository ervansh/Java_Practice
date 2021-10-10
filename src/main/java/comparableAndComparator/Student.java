package comparableAndComparator;

public class Student implements Comparable<Student>{

	int marks;
	String names;

	public Student(int marks, String names) {
		super();
		this.marks = marks;
		this.names = names;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	@Override
	public int compareTo(Student o) {
		if(this.marks > o.marks) return -1;
		else if(this.marks < o.marks) return 1;
		else
		return 0;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", names=" + names + "]";
	}
	

}
