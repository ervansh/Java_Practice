package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 3, 7, 1, 0, -8 };
		int n = a.length;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(7);
		al.add(1);
		al.add(0);
		al.add(-8);
		al.add(100);

		System.out.println("Al is " + al);
		for (int i = 0; i < n - 1; i++) {
			boolean sorted = true;
			for (int j = 0; j < n - 1 - i; j++) {

				if (a[j + 1] < a[j]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					sorted = false;
				}
			}
			if (sorted)
				break;
		}

		for (int i : a) {
			System.out.println("No are in sorted way : " + i);
		}

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		Collections.sort(al);
		System.out.println(al.toString());

		String[] arr = { "Name", "firstname", "LastName" };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
