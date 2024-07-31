package searching_sorting;

public class BinarySearch {

	public static int binarySearch(int[] array, int key) {
		int left = 0, right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == key) {
				return mid;
			}
			if (array[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };
		int key = 30;
		int result = binarySearch(array, key);
		System.out.println("Element found at index: " + result);
		System.out.println("Value of element at index : "+result+" is : "+array[result]);
	}
}
