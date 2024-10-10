package designpattern.factorypattern;

public class CarFactoryImplementation {
	public static void main(String[] args) {
		Car car = CarFactory.getCar("xuv");
		System.out.println(car.makecar());
	}
}
