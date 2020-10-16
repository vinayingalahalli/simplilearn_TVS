package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int res=0;
		try {
		res=x/y;
		String s=null;
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}catch(NullPointerException e) {
		System.out.println("Something is empty");	
		}finally {
			System.out.println("Result is "+res);
		}
		System.out.println("Other lines of code in this app");

	}

}
