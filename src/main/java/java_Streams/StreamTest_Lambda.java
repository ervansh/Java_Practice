package java_Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamTest_Lambda {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println("print values using for each loop............................ \n");
		for (Integer is : values) {
			System.out.println(is);
		}

		System.out.println("Using iterator............................ \n");
		Iterator<Integer> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Using lambda............................ \n");
		values.forEach(i -> System.out.println(i));

		System.out.println("working of the above forearch method using lambda\r\n"
				+ "		 it calls accept method inside interface 'consumer'............................ \n");
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};

		System.out.println("pass the obj of consumer interface in for each............................ \n");
		values.forEach(consumer);

		System.out.println("let's optimize above code, we can write as below............................ \n");
		Consumer<Integer> consumer1 = (i) -> System.out.println(i);
		values.forEach(consumer1);

		System.out.println("let's optimize more, we can pass obj directly in for each............................ \n");
		values.forEach((i) -> System.out.println(i));

		System.out.println(
				"let's remove braces in i as it only accepts only one parameter........................... \n");
		values.forEach(i -> System.out.println(i));

	}

}
