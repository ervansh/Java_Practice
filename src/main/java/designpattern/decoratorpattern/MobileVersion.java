package designpattern.decoratorpattern;

public class MobileVersion extends WebApp{

	private int rank = 10;
	@Override
	int getrank() {
		return rank;
	}

}
