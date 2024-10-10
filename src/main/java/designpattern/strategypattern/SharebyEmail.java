package designpattern.strategypattern;

public class SharebyEmail implements Share {

	@Override
	public void iShare() {
		System.out.println("Share by Email mechanism implemented.");
	}

}
