package java8_lambda_functional_interface_demo;

public class NewLambdaStyleMain {

	public static void main(String[] args) {
		HelloFunctional h1=()->System.out.println("Hello Lambda");
		h1.hello();
		
		HelloFunctional h2=()->System.out.println("Hello Lambda Again");
		h2.hello();
		
		HelloAgain ha= (n)->{
			return "Hello "+n; 
		};
		System.out.println(ha.sayHello("VINAY"));
		System.out.println(ha.sayHello("Rajesh"));
		
		Sum s=(a,b,c)->{
			System.out.println("Result is "+(a+b+c));
		};
		s.add(1100, 22, 2344);
		s.add(2, 99, 1);
	}

}



@FunctionalInterface
interface HelloAgain{
	public String sayHello(String name);
}

@FunctionalInterface
interface Sum{
	void add(int a,int b,int c);
}
