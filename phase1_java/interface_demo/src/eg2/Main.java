package eg2;

public class Main {

	public static void main(String[] args) {
		Child c=new Implementor();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.method5();
		
		
		Parent p=new Implementor();
		p.method1();
		p.method2();
		p.method3();
//		p.method4();
//		p.method5();
		
		Child.InnerInterface i=new Implementor();
		i.inner1();
		i.inner2();
		

	}

}
