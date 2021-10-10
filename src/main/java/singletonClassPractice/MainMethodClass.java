package singletonClassPractice;

public class MainMethodClass {

	public static void main(String[] args) {
		AppConfig instanceofAppConfigClass = AppConfig.getInstance();
		
		String nameof = instanceofAppConfigClass.name="John";
		instanceofAppConfigClass.setAge(20);
		
		int ageis = instanceofAppConfigClass.getAge();
		
		System.out.println("Name is : "+nameof);
		System.out.println("Age is : "+ageis);
		
	}
}
