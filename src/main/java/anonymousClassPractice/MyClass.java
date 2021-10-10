package anonymousClassPractice;

public class MyClass implements Age{

	@Override
	public int getAge() {
		System.out.println("Age is : "+age);
		return age;
	}

}
