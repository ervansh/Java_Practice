package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Delete_anElementFromArray_usingCollections {

	/**
	 * Remove/Delete an element using collections
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] arr = {"Red", "Green", "Blue"};
		
		 List<String> list = new ArrayList<String>(Arrays.asList(arr));
		 list.remove(2);
		 System.out.println(list);
		 list.remove("Green");
		 System.out.println(list);

	}

}
