package factorydesignpattern;

public class Sedan implements Car{

	String carname = "sedan";
	@Override
	public String makecar() {
		System.out.println("Sedan car manufactured.");
		return "Sedan is Ready";
	}

}
