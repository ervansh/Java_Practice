package searching_sorting;


public class SelectionSort {

	public static void main(String[] args) {
			int a[] = {3, 6, 1, -6, 8};
			int n = a.length;
			int temp;
			
			for(int i=0; i<n-1 ; i++) {
				
				int minIndex=i;
				for(int j=i; j<n; j++) {
					if(a[j]<a[minIndex]) {
						minIndex=j;
					}
				}
				temp = a[i];
				a[i]=a[minIndex];
				a[minIndex]=temp;
			}
			for (int i : a) {
				System.out.println("Sorted array is : "+i);
			}
			
	}

}
