package example;

public class Calculator {

	private int a;
	private int b;
	public Calculator() {
	System.out.println("Hello Constructor");
	}
	
	public Calculator(String name) {
		System.out.println("Hello "+name);
	}
	
	public Calculator(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public int add() {
		return a+b;
	}
	
	public int subtract() {
		return a-b;
	}
	
	public int multiply() {
		return a*b;
	}
}
