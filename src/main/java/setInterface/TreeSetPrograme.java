package setInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class TreeSetPrograme {

	public static void main(String[] args) {
		System.out.println("<<<<<<<<<<<<<<<<<<<Tree set>>>>>>>>>>>>>>>>>>");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("rahul");
		ts.add("vansh");
		ts.add("rahul");
		ts.add("rahul");
		System.out.println(ts);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<Queue>>>>>>>>>>>>>>>>>>");
		Queue<String> q = new LinkedList<String>();
		q.add("rahul");
		q.add("vansh");
		q.add("rahul");
		q.add("rahul");
		System.out.println(q);
		
	}

}
