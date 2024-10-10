package designpattern.decoratorpattern;

public class DecoratorImplementation {

	public static void main(String[] args) {
		DesktopVersion desktop = new DesktopVersion();
		NewsWidget news = new NewsWidget(desktop);
		System.out.println("Rank of news widget with Desktop version is :: "+news.getrank());
		
		MobileVersion mobile = new MobileVersion();
		NewsWidget news1 = new NewsWidget(mobile);
		System.out.println("Rank of news widget with Mobile version is :: "+news1.getrank());
	}
}
