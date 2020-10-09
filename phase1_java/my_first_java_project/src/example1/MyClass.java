package example1;

public class MyClass {

	public static void main(String[] args) {
		System.out.println("Hello World from JAVA");
		System.out.println("Hello Again");
		String s="Mathumathi";
		System.out.println("Hello "+s+" Welcome to JAVA");
		HelloClass.helloStatic(); //if it is static
		
		/*
		 * To access non static methods of any class
		 * please create a object and then access it.
		 * Like below example
		 */
		
		HelloClass h=new HelloClass();
		h.helloNonStatic();
		h.helloNonStaticAgain();
		h.helloNonStatic();
		
		//Accesible because it is in same package
		h.helloProtected();
		
		//Accesible because it is in same package
		h.helloDefault();
		
		//Not accesible because it is private
		//h.hiPrivate();
		
	}

}
