package designpattern.factorypattern;

public class XUV implements Car{

	@Override
	public String makecar() {
		System.out.println("XUV car is ready.");
		return "XUV";
	}

}
