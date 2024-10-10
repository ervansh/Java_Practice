package designpattern.strategypattern;

public class ClassicPhoneCamera extends PhoneCamera {

	@Override
	void editPhoto() {
		System.out.println("Photo edit using classic camera features.");
	}

}
