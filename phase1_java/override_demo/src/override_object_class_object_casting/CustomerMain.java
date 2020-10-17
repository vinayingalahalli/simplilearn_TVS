package override_object_class_object_casting;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c1 = new Customer(100, "Ramesh");
		System.out.println("c1 = "+c1);
	//	System.out.println(c1.toString());
		
		Customer c2 = new Customer(101, "Ramya");
		System.out.println("c2 = "+c2);
		
		if(c1.equals(c2)) {
			System.out.println("Yes its same");
		}else {
			System.out.println("No not same");
		}
	}
}
