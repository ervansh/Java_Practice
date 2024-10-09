package strings;

public class ReverseString {

	public static void main(String[] args) {
		String input = "GeeksforGeeks";

		// Way-1
		byte[] inputbyte = input.getBytes();
		byte[] result = new byte[inputbyte.length];

		for (int i = 0; i < inputbyte.length; i++) {
			result[i] = inputbyte[inputbyte.length - i - 1];
		}
		System.out.println(new String(result) + " way-1");

		// way-2
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		StringBuilder rv = sb.reverse();
		System.out.println(rv + "  string builder");

		// way-3
		StringBuffer sbuff = new StringBuffer(input);
		System.out.println(sbuff.reverse() + " string buffer");

		// way-4
		String reverse = null;
		for (int i = (input.length() - 1); i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse + " way-4");

	}
}
