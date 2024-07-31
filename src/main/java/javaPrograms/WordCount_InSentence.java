package javaPrograms;

import java.util.HashMap;

/**
 * Java program to count Occurrences of Each word in a sentence
 */
public class WordCount_InSentence {

	public static void main(String[] args) {
		CharacterCount("Test Automation Java Automation");
	}

	static void CharacterCount(String inputString) {
		HashMap<String, Integer> charCountMap = new HashMap<>();
		for (String s : inputString.split(" ")) {
			if (charCountMap.containsKey(s)) {
				charCountMap.put(s, charCountMap.get(s) + 1);
			} else {
				charCountMap.put(s, 1);
			}
		}
		System.out.println("Count of words in a given sentence : " + charCountMap);
	}
}
