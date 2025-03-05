package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class QuestionsNo2 {

	// Problem: 2. wap-->> input String s= "aabbbccccff"; o/p: a=2, b=3, c=4, f=2

	public static void main(String[] args) {

		String s = "aabbbccccffd";
		int count = s.length();
		System.out.println(count + " count");
		Map<Character, Integer> hmap = new HashMap<>();

		for (int i = 0; i < count; i++) {
			char[] character = s.toCharArray();
			hmap.put(character[i], hmap.getOrDefault(character[i], 0) + 1);
		}
//get values and keys
		for (Map.Entry<Character, Integer> hmapdata : hmap.entrySet()) {
			System.out.println(hmapdata.getKey() + " = " + hmapdata.getValue());
		}
	//print all 
		System.out.println(hmap);
	}
}
