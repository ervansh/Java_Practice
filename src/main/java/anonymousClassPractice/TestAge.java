package anonymousClassPractice;

public class TestAge implements Age{

	@Override
	public int getAge() {
		System.out.println("Age is : "+age);
		return age;
	}

}
