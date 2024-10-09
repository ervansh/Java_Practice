package strings;

import java.util.LinkedList;

public class StringManipulation {

	public static void main(String[] args) {
		String firstname = "Vanshraj"; // memory allocation in String pool area

		String lastname = new String("Singh"); // memory allocation in heap

		lastname = "DJ";
		System.out.println("First name :" + firstname);
		System.out.println("Last name :" + lastname);

		String s = "AB";
		System.out.println(s.hashCode() + " has code of ab");
		s += "C";
		System.out.println(s.hashCode());

		// String class overrides equals method from object class but stringbuilder and
		// string buffer does not.
		final String STR = "ABC";
		String s1 = new String(STR);
		String s2 = new String(STR);
		System.out.println(s1.equals(s2));

		StringBuilder sb1 = new StringBuilder(STR);
		StringBuilder sb2 = new StringBuilder(STR);
		System.out.println(sb1.equals(sb2));

		// Since String is immutable, its length is fixed. But StringBuilder has the
		// setLength() method, which can change the StringBuilder object to the
		// specified length.

		// When to use string and StringBuilder?
		// A String can be used when immutability is required, or concatenation
		// operation is not required. A StringBuilder can be used when a mutable string
		// is needed without the performance overhead of constructing lots of strings
		// along the way.

		String str = "abc";
		String str1 = new String();
		str1="xyz";

		str1 = str1+str;
		String str2=str1+str1;
		System.out.println(str2);


		System.out.println(str);
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(str2);
		ll.forEach(e -> System.out.println(e));
	}

}
