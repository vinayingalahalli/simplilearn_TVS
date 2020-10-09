package example2;

public class ScopesDemo {

	int y=99;//global
	
	int a; //global and instance/object level variable
	int b;
	static int z; //global class level variable
	
	public static void main(String[] args) {
	
		int x=100;//local
		
		ScopesDemo s1=new ScopesDemo();
		s1.a=99;
		s1.b=899;
		z=10000;
		System.out.println("Printing s1");
		s1.printABZ();
		
		ScopesDemo s2=new ScopesDemo();
		s2.a=8888;
		s2.b=76;
		System.out.println("\nPrinting s2");
		s2.printABZ();
		
		z=55555;
		
		System.out.println("\nPrinting s1 again");
		s1.printABZ();
		
		System.out.println("\nPrinting s2 again");
		s2.printABZ();
	}
	
	public void printABZ() {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("z : "+z);
	}

}
