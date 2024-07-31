package arrayspractice;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {

		int[] num = { 1, 11, 3, 8, 5 };
		String name = "Vanshraj";
		char[] namearray = name.toCharArray();
		for (int i = 0; i < namearray.length; i++) {
			System.out.println(namearray[i]);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println("sorted array is :" + num[i]);
		}

		List<int[]> listnum = Arrays.asList(num);
		// int size = listnum.size();
		// System.out.println("Size of list is :"+size);
		listnum.forEach(i -> System.out.println(Arrays.toString(i)));

	}

}
