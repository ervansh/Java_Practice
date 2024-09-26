package stringManipulations;

public class RemoveJunkCharactersFromString {

	public static void main(String[] args) {

		String str = "@#$%^& selenium (*T& Testing  %%%%&";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
