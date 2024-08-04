package exceptionHandling;

public class CustomException extends Exception{

	public CustomException(String str) {
		super(str);
	}
	
	public void mycustomException() {
		System.out.println("Hello from custom exception class.");
	}
	
	
}
