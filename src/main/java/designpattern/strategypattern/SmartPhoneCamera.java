package designpattern.strategypattern;

public class SmartPhoneCamera extends PhoneCamera {

	@Override
	void editPhoto() {
		System.out.println("Photo edit using smart camera features.");
	}

}
