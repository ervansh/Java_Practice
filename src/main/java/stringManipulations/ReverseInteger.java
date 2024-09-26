package stringManipulations;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 12345678;
		
		//way-1
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse number is : "+rev);
	
		//way-2
		int number= 12345678;
		StringBuffer sbuff = new StringBuffer(String.valueOf(number));
		System.out.println(sbuff);
		sbuff.reverse();
		System.out.println("Reverse num using s buff is : "+ sbuff);
	
	}

}
