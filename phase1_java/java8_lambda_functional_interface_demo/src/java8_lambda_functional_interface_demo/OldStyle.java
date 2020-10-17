package java8_lambda_functional_interface_demo;

public class OldStyle implements HelloFunctional {

	public static void main(String[] args) {
		
		HelloFunctional h1=new OldStyle();
		h1.hello();
		
		HelloFunctional h2=new HelloFunctional() {
			
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("Hello agaoin old style");
			}
		};
		h2.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello from OldStyle");
	}

}
