package designpattern.strategypattern;

public abstract class PhoneCamera {

	private Share sharestrategy;

	public void takePhoto() {
		System.out.println("Take photo");
	}

	public void savePhoto() {
		System.out.println("Save photo");
	}

	abstract void editPhoto();

	public void setShareStrategy(Share sharestrategy) {
		this.sharestrategy = sharestrategy;
	}

	public void sharePhoto() {
		sharestrategy.iShare();
	}
}
