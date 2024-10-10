package designpattern.strategypattern;

public class StrategyImplementation {

	public static void main(String[] args) {
		PhoneCamera camera = new SmartPhoneCamera();
		camera.takePhoto();
		camera.editPhoto();
		camera.savePhoto();
		camera.setShareStrategy(new SharebyWhatsapp());
		camera.sharePhoto();

		System.out.println("\nNow you wish to change the share strategy..... you can do it as below.\n");
		camera.setShareStrategy(new SharebyEmail());
		camera.sharePhoto();
	}
}
