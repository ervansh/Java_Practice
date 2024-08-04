package java_Streams;

import java.util.Arrays;
import java.util.List;

public class StreamTest_Lambda {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		// print values
		// using for each loop
//		for (Integer is : values) {
//			System.out.println(is);
//		}

		// using iterator
//		Iterator<Integer> itr = values.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		// using lambda
		// values.forEach(i -> System.out.println(i));

		// working of the above forearch method using lambda
		// it calls accept method inside interface 'consumer'

//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//			System.out.println(t);
//			}
//		};
//		//pass the obj of consumer interface in for each
//		values.forEach(c);

		// let's optimize above code
		// we can write as
//		Consumer<Integer> c = (i) -> System.out.println(i);
//		values.forEach(c);

		// let's optimize more
		// we can pass obj directly in for each
		// values.forEach((i) -> System.out.println(i));

		// let's remove braces in i as it only accepts only one parameter
		values.forEach(i -> System.out.println(i));

	}

}
