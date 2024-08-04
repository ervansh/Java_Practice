package exceptionHandling;

public class MainMethod {

	public static void main(String[] args) {
		
		try {
			//System.out.println("Inside main method.");
			throw new CustomException("Custom exception calling.");
		}catch(CustomException e){
			e.mycustomException();
		}

	}

}
