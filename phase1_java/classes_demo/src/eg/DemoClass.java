package eg;

public class DemoClass {

	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.outerMethod();
		
		Outer.InnerPublic i=o.new InnerPublic();
		i.helloInnerPublic();
		
		Outer.InnerPublicStatic.helloInnerPublicStatic();
		
		Outer.InnerPublicStatic is=new Outer.InnerPublicStatic();
		is.helloInnerPublicStaticNonStatic();
	}

}


 class M{
	
}
 
 class A{
	 
 }
 class X{
	 
 }
 
