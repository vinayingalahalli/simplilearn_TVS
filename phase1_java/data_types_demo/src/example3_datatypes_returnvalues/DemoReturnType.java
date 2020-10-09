package example3_datatypes_returnvalues;

public class DemoReturnType {

	public static void main(String[] args) {
	
		Calculator c=new Calculator();
		System.out.println("result is "+c.add(100, 22));
		
		int x=99;
		int y=299;
		System.out.println("result is "+c.add(x, y));
		
		System.out.println("result of divide "+c.divide(22, 3));
		
		System.out.println("result of add 3params "+c.add(10, 22, 33));
		
		System.out.println("result of add with 2 floats "+c.add(22.33f, 33.12f));
	}

}
