package launchAnyAppUsingJava;

import java.io.IOException;

public class NotepadAppRun {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("notepad.exe");
//		Thread.sleep(5000);
//		process.destroy();

		
		//launch specific notepad file.
		
		Process process = runtime.exec("notepad.exe D:\\ServiceNow-Learnings\\servicenow_KT.txt");
		Thread.sleep(5000);
		process.destroy();
	}

}
