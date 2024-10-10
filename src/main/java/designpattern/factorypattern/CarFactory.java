package designpattern.factorypattern;

public class CarFactory {

	public static Car getCar(String cartype) {
		switch (cartype.toLowerCase()) {
		case "sedan":
			return new Sedan();
			
		case "xuv":
			return new XUV();
		default:
			throw new IllegalArgumentException("Invalid car type.");
		}
	}
}
