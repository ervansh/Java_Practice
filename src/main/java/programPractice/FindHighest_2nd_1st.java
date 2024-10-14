package programPractice;

import java.util.Arrays;

public class FindHighest_2nd_1st {

	/*
	 * Find 2nd highest of the given array
	 */
	public static void main(String[] args) {
		int[] arr = {1, 656, 2, 34, 55, 90};
		Arrays.sort(arr);
		System.out.println("1st highest : "+arr[arr.length-1]);
		System.out.println("2nd highest : "+arr[arr.length-2]);
	}

}
