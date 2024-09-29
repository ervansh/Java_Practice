package abstractionPart2;

public class Audi extends Car{

	@Override
	public void accelerator() {
		System.out.println("Audi has accelerator");
	}

	@Override
	public void breaks() {
		System.out.println("Audi has breaks");
		
	}
	
	@Override
	public void engineStart() {
		super.engineStart();
		System.out.println("Audi engine starts...");
	}

	public void musicSystem() {
		System.out.println("Audi has high-end music system.");
	}
}
