package listsInterface;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList is a class which is implemented in the collection framework which
 * inherently implements the linked list data structure. It is a linear data
 * structure where the elements are not stored in contiguous locations and every
 * element is a separate object with a data part and address part. The elements
 * are linked using pointers and addresses. Each element is known as a node. Due
 * to the dynamicity and ease of insertions and deletions, they are preferred
 * over the arrays. Let’s see how to create a list object using this class.
 * 
 * @author Vanshraj.Singh
 *
 */
public class LinkedListTest {
	public static void main(String[] args) {
		// Size of the LinkedList
		int n = 5;

		// Declaring the List with initial size n
		List<Integer> ll = new LinkedList<Integer>();

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= n; i++)
			ll.add(i);

		// Printing elements
		System.out.println(ll);

		// Remove element at index 3
		ll.remove(3);

		// Displaying the list after deletion
		System.out.println(ll);

		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
