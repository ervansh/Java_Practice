package designpattern.decoratorpattern;

public class NewsWidget extends WidgetDecorator {
	private int rank = 2;

	public NewsWidget(WebApp webapp) {
		super(webapp);
	}

	@Override
	int getrank() {
		return webapp.getrank() + rank;
	}

}
