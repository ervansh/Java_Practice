package designpattern.builderpattern;

public class OrderBicycle {
	public static void main(String[] args) {
		System.out.println("Customer orders bicycle with double seat and carrier.");
		 Bicycle cycle = new Bicycle.BicycleBuilder("2", "Disk breaks.").setDoublestand(true).setCarrier(true).build();
		System.out.println(cycle);
	}
}
