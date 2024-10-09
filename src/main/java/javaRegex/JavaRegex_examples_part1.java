package javaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex_examples_part1 {
//There are three ways to write the regex example in Java.
	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches("...s", "atas");

		System.out.println(b + " " + b2 + " " + b3);
	}

}
