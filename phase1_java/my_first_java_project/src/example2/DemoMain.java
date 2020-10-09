package example2;

import example1.HelloClass;

public class DemoMain {

	public static void main(String[] args) {
	hey();
	HelloClass.helloStatic();
	
	HelloClass h=new HelloClass();
	h.helloNonStatic();
//	h.helloProtected();  
// Not visible due to outside the package and no relationship
	
//	h.helloDefault();
//Not visible due to it is outside the package.	
	
	
	//Not accesible because it is private
			//h.hiPrivate();
	}
	
	public static void hey() {
		System.out.println("Hey from static method of DemoMain");
	}

}
