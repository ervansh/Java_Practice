package javaPrograms;

public class Find_OccurrenceOf_EveryDigit_InArray {

	// declare array of integers and find the count/occurrence of every number
	
	public static void main(String[] args) {

		int[] arraynum = {1, 2, 3, 4, 5, 5, 9, 9, 9, 2, 2, 1};
		
		boolean[] counted = new boolean[arraynum.length];
		
		for(int i=0; i<arraynum.length; i++) {
			if(counted[i]) {
				continue;
			}
			
			int count=1;
			for(int j=i+1; j<arraynum.length; j++) {
				if(arraynum[i]==arraynum[j]) {
					count++;
					counted[j] = true;
				}
			}
			System.out.println("Count of "+arraynum[i]+" is "+count);
		}
	

	}

}
