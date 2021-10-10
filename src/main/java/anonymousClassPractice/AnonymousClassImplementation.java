package anonymousClassPractice;

public class AnonymousClassImplementation {

	/*
	 * We can achieve anonymous class using abstract class or interface
	 */
	public static void main(String[] args) {

		
		/*
		 * Traditional way.
		 */
		
		//		MyClass myclass = new MyClass();
		//		myclass.getAge();
		
		
		/*
		 * Using anonymous class using Interface
		 */

				
		Age age =new Age() {
			@Override
			public int getAge() {
				System.out.println("Anonymous age is : "+age);
				return age;
			}
		};
		
		age.getAge();
	
	
	
		/*
		 * Using anonymous class using Abstract Class
		 */

	PersonAbstractClass person = new PersonAbstractClass() {
		
		@Override
		void eat() {
			System.out.println("Anonymous Person eat.");
		}
	};
	person.eat();
	
	
	
	
	
	
	
	
	
	
	
	}

}
