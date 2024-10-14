package programPractice;

public class FirstLetterOfWord_inCaps {

	
	//WAP to convert first letter of every word to upper case. eg vanshraj singh converted as Vanshraj Singh
	
	public static void main(String[] args) {

		String name = "vanshraj singh";
		String capitalizedName = capitalizeFirstLetterOfEachWord(name);
		System.out.println(capitalizedName);

	}

	public static String capitalizeFirstLetterOfEachWord(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		String[] words = str.split(" ");
		StringBuilder capitalized = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {
				capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
			}
		}

		return capitalized.toString().trim();
	}

}
