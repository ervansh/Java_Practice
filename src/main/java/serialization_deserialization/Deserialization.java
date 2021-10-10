package serialization_deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String filename = "./src/main/java/serialization_deserialization/ser.txt";
		FileInputStream fis = new FileInputStream(new File(filename));
		ObjectInputStream ois = new ObjectInputStream(fis);

		System.out.println("Deserialization...............");
		Students s = (Students) ois.readObject();
		int id = s.id;
		System.out.println(id + " id..........");
		System.out.println(s.name + " id..........");
		ois.close();
	}

}
