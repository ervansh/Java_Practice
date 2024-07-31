package javaPrograms;

public class FindFirst_and_Second_largestNumber {

	public static void main(String[] args) {
		int[] arr = {89, 23, 43, 5, 75, 12};
		
		int firstlargest = 0;
		int secondlargest = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(firstlargest < arr[i]) {
				secondlargest = firstlargest;
				firstlargest = arr[i];
			}else if(secondlargest < arr[i]) {
				secondlargest = arr[i];
			}
		}
		System.out.println("First Largest number: "+firstlargest+"\nand Second Largest number is :"+secondlargest);
	}

}
