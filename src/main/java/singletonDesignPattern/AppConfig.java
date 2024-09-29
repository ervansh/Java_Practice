package singletonDesignPattern;

public class AppConfig {
	private static AppConfig obj=null;
	
	String name;  //we will access this variable with name itself
	int age;		//we will access this variable with getter and setter

	private AppConfig() {
		
	}
	
	public static AppConfig getInstance() {
		if(obj==null) {
			obj=new AppConfig();
		}
		return obj;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
