package eg2;

import java.util.Scanner;

public class CreateEmployeeSetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("Enter Employee name");
		employee.setName(sc.nextLine());
		System.out.println("Enter Employee age");
		employee.setAge(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employee contact");
		employee.setContact(Long.parseLong(sc.nextLine()));
		System.out.println("Enter Employee salary");
		employee.setSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Employee gender(m/f/o)");
		employee.setGender(sc.nextLine().charAt(0));
		
		//Employee e1=new Employee(name, age, salary, contact, gender);
		
		System.out.println(employee);

	}

}
