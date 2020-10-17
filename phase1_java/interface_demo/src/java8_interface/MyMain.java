package java8_interface;

public class MyMain implements HelloJava8Interface{

	public static void main(String[] args) {
		HelloJava8Interface.helloStatic();
		HelloJava8Interface h=new MyMain();
		h.helloDefault();

	}

}
