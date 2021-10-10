package listsInterface;

import java.util.List;
import java.util.Stack;

/**
 * Stack is a class which is implemented in the collection framework and extends
 * the vector class models and implements the Stack data structure. The class is
 * based on the basic principle of last-in-first-out. In addition to the basic
 * push and pop operations, the class provides three more functions of empty,
 * search and peek. Let’s see how to create a list object using this class.
 * 
 * @author Vanshraj.Singh
 *
 */
public class StackTest {

	public static void main(String[] args) {
		// Size of the stack
		int n = 5;

		// Declaring the List
		List<Integer> s = new Stack<Integer>();

		// Appending the new elements
		// at the end of the list
		for (int i = 1; i <= n; i++)
			s.add(i);

		// Printing elements
		System.out.println(s);

		// Remove element at index 3
		s.remove(3);

		// Displaying the list after deletion
		System.out.println(s);

		// Printing elements one by one
		for (int i = 0; i < s.size(); i++)
			System.out.print(s.get(i) + " ");
	}

}
