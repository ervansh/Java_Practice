package interviewQuestions;

import java.util.HashMap;

public class QuestionsNo2 {
	public static void main(String[] args) {

		String s= "aaabbbb";
		byte[] byts = s.getBytes();
		int count = s.length();
		
		HashMap<String, Integer> hmap = new HashMap<String , Integer>();
		
		for(int i=0; i< count; i++) {
			char character = s.charAt(i);
			System.out.println(character);
			Integer out = hmap.get(character);
			hmap.put(s, i);
		}
		
		System.out.println(hmap);

	}
}
