package eg1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter contact");
		long contact=Long.parseLong(sc.nextLine());
		System.out.println("Enter salary");
		double salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter gender(m/f/o)");
		char gender=sc.nextLine().charAt(0);
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Contact : "+contact);
		System.out.println("Salary : "+salary);
		System.out.println("Gender : "+gender);

	}

}
