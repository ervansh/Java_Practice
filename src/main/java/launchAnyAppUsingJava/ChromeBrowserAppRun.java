package launchAnyAppUsingJava;

import java.io.IOException;

public class ChromeBrowserAppRun {

	public static void main(String[] args) throws IOException {

		Runtime runtime = Runtime.getRuntime();

		String[] string = new String[] { "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe",
				"https://www.google.com/" };
		runtime.exec(string);

	}

}
