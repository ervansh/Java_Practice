package designpattern.decoratorpattern;

public class DesktopVersion extends WebApp{
	private int rank = 20;
	@Override
	int getrank() {
		return rank;
	}

}
