package oops.encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		Student std= new Student();
//		std.age=52;
//		std.name="RM";
		std.setAge(65);
		std.setAge(30);
			System.out.println(std.getAge() +" New age");
			System.out.println();
	}

}
