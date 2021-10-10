package abstractionPart2;

public class WagonR extends Car{

	@Override
	public void accelerator() {
		System.out.println("WagonR has accelerator");
	}

	@Override
	public void breaks() {
		System.out.println("WagonR has breaks");
	}

}
