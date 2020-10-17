package eg1;

public class Implementor implements MyInterface1,MyInterface2 {

	@Override
	public void myMethod1() {
		// TODO Auto-generated method stub
		System.out.println("myMethod1() of MyInterface1");
	}

	@Override
	public void myMethod2() {
		// TODO Auto-generated method stub
		System.out.println("myMethod2() of MyInterface1");
	}

	@Override
	public void myMethod3() {
		// TODO Auto-generated method stub
		System.out.println("myMethod3() of MyInterface1 x = "+(x));
	}

	@Override
	public void myMethod4() {
		// TODO Auto-generated method stub
		System.out.println("myMethod4() of MyInterface1");
	}

	@Override
	public void myInt2Method1() {
		// TODO Auto-generated method stub
	System.out.println("myInt2Method1 of MyInterface2");	
	}

	@Override
	public void myInt2Method2() {
		// TODO Auto-generated method stub
		System.out.println("myInt2Method2 of MyInterface2");	
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common() for both MyInterface1 and MyInterface2");		
	}
	

}
