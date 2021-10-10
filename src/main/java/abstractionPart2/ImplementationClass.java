package abstractionPart2;

public class ImplementationClass {

	public static void main(String[] args) {
		WagonR wagonr = new WagonR();
		wagonr.breaks();
		wagonr.accelerator();
		
		
		Audi audi = new Audi();
		audi.breaks();
		audi.accelerator();
		audi.engineStart();
		audi.engineStop();
	}
}
