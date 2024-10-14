package oops.abstractionPart2;

public class ImplementationClass {

	public static void main(String[] args) {
		WagonR wagonr = new WagonR();
		wagonr.breaks();
		wagonr.accelerator();

		System.out.println("\n");
		Audi audi = new Audi();
		audi.breaks();
		audi.accelerator();
		audi.musicSystem();
		audi.engineStart();
		audi.engineStop();
	}
}
