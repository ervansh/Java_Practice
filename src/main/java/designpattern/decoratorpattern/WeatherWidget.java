package designpattern.decoratorpattern;

public class WeatherWidget extends WidgetDecorator {
	private int rank = 3;

	public WeatherWidget(WebApp webapp) {
		super(webapp);
	}

	@Override
	int getrank() {
		return webapp.getrank() + rank;
	}

}
