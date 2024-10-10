package designpattern.decoratorpattern;

public abstract class WidgetDecorator extends WebApp {
	WebApp webapp;

	public WidgetDecorator(WebApp webapp) {
		super();
		this.webapp = webapp;
	}
}
