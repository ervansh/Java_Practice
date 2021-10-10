package programPractice;

public class Find_LargestAndSmallestNumber {

	public static void main(String[] args) {
		int number[] = {1, 45, -1, 20, 0, 123, 243};
		
		int largest = number[0];
		int smallest = number[0];
		
		for (int i = 0; i < number.length; i++) {
			if(largest < number[i]) {
				largest =number[i];
			}else if(smallest > number[i]){
				smallest = number[i];
			}
		}
		System.out.println("Largest number is : "+largest);
		System.out.println("Smallest number is : "+smallest);
	}

}
