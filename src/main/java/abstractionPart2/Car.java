package abstractionPart2;

public abstract class Car {

	abstract public void accelerator();
	public abstract void breaks();
	
	public void engineStart() {
		System.out.println("Engine start...");
	}
	
	public void engineStop() {
		System.out.println("Engine stop...");
	}
}
