package eg1;

public class Main {

	public static void main(String[] args) {
		MyInterface1 i1=new Implementor();
		System.out.println("Accessing MyInterface1");
		i1.myMethod1();
		i1.myMethod2();
		i1.myMethod3();
		i1.myMethod4();
		i1.common();
		
		MyInterface2 i2=new Implementor();
		System.out.println("\n\nAccessing MyInterface2");
		i2.myInt2Method1();
		i2.myInt2Method2();
		i2.common();

	}

}
