package eg2;

import java.util.Scanner;

public class CreateEmployeeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees");
		int count=Integer.parseInt(sc.nextLine());
		Employee emp[]=new Employee[count];
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println("\nEnter Details of Employee - "+(i+1));
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
			emp[i]=new Employee(name, age, salary, contact, gender);
		}
	
		
		
		
		System.out.println("\nPrinting all employees");
		for(Employee e:emp) {
			System.out.println(e);
		}

	}

}
