package searching_sorting;

public class LinearSearch {

	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return i;
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		int key = 30;
		int result = linearSearch(array, key);
		System.out.println("Element found at index: " + result);
		System.out.println("Value of element at index : "+result+" is : "+array[result]);
	}
}
