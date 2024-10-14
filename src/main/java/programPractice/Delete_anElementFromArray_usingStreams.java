package programPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Delete_anElementFromArray_usingStreams {

	//delete an element from array by using java 8 streams
	
	public static void main(String[] args) {
		int[] numarr = {1, 4, 5, 2, 5};
		
		 int[] result = removeElement(numarr, 5);
		System.out.println(Arrays.toString(result));
		

	}
	
	public static int[] removeElement(int[] nums, int valueToDelete) {
		return IntStream.range(0, nums.length)
		.filter(i -> nums[i] != valueToDelete)
		.map(i -> nums[i])
		.toArray();
	}

}
