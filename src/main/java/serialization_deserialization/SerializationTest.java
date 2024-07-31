package serialization_deserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Students std = new Students(001, "John");

		String filename = "./src/main/java/serialization_deserialization/students.txt";
		FileOutputStream fos = new FileOutputStream(new File(filename));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println("Serialization...........................");
		oos.writeObject(std);
		oos.close();
		fos.close();
	}
}
