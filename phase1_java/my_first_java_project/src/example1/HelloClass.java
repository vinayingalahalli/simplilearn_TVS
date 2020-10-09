package example1;

public class HelloClass {

	public static void helloStatic() {
		System.out.println("Hello from static method of HelloClass");
	}
	
	public void helloNonStatic() {
		System.out.println("Hello from non static method");
	}
	
	public void helloNonStaticAgain() {
		System.out.println("hello non static method from HelloClass again");
	}
	
	protected void helloProtected() {
		System.out.println("hello from helloProtected()");
	}
	
	void helloDefault() {
		System.out.println("hello from helloDefault()");
	}
	
	private void hiPrivate() {
		System.out.println("Hi from private");
	}
}
