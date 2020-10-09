package eg2;

import java.util.Scanner;

public class CreateEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name");
		String name=sc.nextLine();
		System.out.println("Enter Employee age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee contact");
		long contact=Long.parseLong(sc.nextLine());
		System.out.println("Enter Employee salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter Employee gender(m/f/o)");
		char gender=sc.nextLine().charAt(0);
		
		Employee e1=new Employee(name, age, salary, contact, gender);
		
		System.out.println(e1);
	}

}
