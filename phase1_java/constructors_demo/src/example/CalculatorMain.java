package example;

public class CalculatorMain {

	public static void main(String[] args) {
	
		Calculator c1=new Calculator();
		
		Calculator c2=new Calculator("VINAY");
		
		
		Calculator c3=new Calculator(100, 3333);
		System.out.println(c3.add());
		System.out.println(c3.subtract());
		System.out.println(c3.multiply());

	}

}
