package sorting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckIfListIsSorted {

	public static void main(String[] args) {
		
		ArrayList<String> listofstr = new ArrayList<String>();
		listofstr.add("8");
		listofstr.add("10");
		listofstr.add("23");
		listofstr.add("100");
		System.out.println(isSorted(listofstr));
		

	}
	
	public static boolean isSorted(List<String> listofString) {
		if(listofString.isEmpty() || listofString.size() == 1) {
			return true;
		}
		Iterator<String> itr = listofString.iterator();
		String previous = itr.next();
		String current = itr.next();
		while(itr.hasNext()) {
			current = itr.next();
			if(previous.compareTo(current)<0) {
				return false;
			}
			previous = current;
		}
		return true;
	}

}
