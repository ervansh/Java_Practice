package interviewQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class HandlingWindowsPopUps {
	public static void main(String[] args) throws AWTException {

		Robot robot = new Robot();
		robot.delay(1000);

		String value = "Value to enter in windows text field";

		for (char c : value.toCharArray()) {
			int keycode = KeyEvent.getExtendedKeyCodeForChar(c);
			robot.keyPress(keycode);
			robot.keyRelease(keycode);
		}

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
