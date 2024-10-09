package abstraction;

public class ImplementationClass {

	public ImplementationClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Abstraction ab = new Abstraction() {

			@Override
			void lenevoLaptop() {
				System.out.println("This is a Lenevo laptop.");
			}
		};
		ab.laptop();
		ab.lenevoLaptop();
	}
}
