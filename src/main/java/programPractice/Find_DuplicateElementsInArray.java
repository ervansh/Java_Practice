package programPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class Find_DuplicateElementsInArray {

	public static void main(String[] args) {
		String inputs[] = {"Java", "C", "Python", "JS", "Java", "Vansh"};

		//Way-1
		Set<String> hset = new HashSet<String>();
		for(int i=0 ; i<inputs.length ; i++) {
			if(hset.add(inputs[i]) == false) {
				System.out.println("Duplicate string :"+ inputs[i]);
			}
		}
		
		System.out.println("*******************************");
		//way-2
		for(int i=0 ; i<inputs.length ; i++) {
			for(int j=i+1 ; j< inputs.length ; j++) {
				if(inputs[i].equals(inputs[j])) {  
					System.out.println("Duplicate string "+inputs[j]);
				}
			}
		}
		System.out.println("*******************************");
		//way-3
		HashMap<String, Integer> inputsmap = new HashMap<>();
		
		for (String input : inputs) {
			Integer count = inputsmap.get(input);
			if(count == null) {
				inputsmap.put(input, 1);
			}else {
				inputsmap.put(input, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entries = inputsmap.entrySet();
		for (Entry<String, Integer> entry : entries) {
			if(entry.getValue() > 1) {
				System.out.println("Duplicate elements : "+entry.getKey());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
