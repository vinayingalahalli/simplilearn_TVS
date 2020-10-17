package java8_interface;

public interface HelloJava8Interface {

	default void helloDefault() {
		System.out.println("Hello default from Java8");
	}
	
	public static void helloStatic() {
		System.out.println("Hello static method from Java8");
	}
}
