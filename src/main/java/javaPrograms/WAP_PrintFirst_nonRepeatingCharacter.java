package javaPrograms;

public class WAP_PrintFirst_nonRepeatingCharacter {

	// WAP to print first non repeating character
	
	public static void main(String[] args) {
		String s = "array";
		char[] arr = s.toCharArray();
		for (char c : arr) {
			if(s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println("First character is : "+c);
				break;
			}
		}

	}

}
