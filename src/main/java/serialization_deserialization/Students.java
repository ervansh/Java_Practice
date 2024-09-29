package serialization_deserialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Students implements Serializable{

	int id;
	String name;
	
	public Students(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	
}
