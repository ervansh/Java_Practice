package test;

public class TestIris {

	public static void main(String[] args) {
		
		String str = "Today is october 5";
		getNumeric(str);
		

	}
	
	public static void getNumeric(String str) {
	
		for(int i=0 ; i<= str.length() ; i++) {
			
			System.out.println(str.charAt(i));
		}
	}

}
