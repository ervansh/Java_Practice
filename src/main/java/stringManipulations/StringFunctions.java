package stringManipulations;

public class StringFunctions {

	public static void main(String[] args) {
		String cardnum = "1234-8765-0292-9826";
		
		String cardnumwithouthyphen = cardnum.replace("-", "");
		System.out.println("Card number without hyphen : "+cardnumwithouthyphen);
		
	}

}
