package example2;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Girish");
		e1.setAge(33);
		e1.setCity("Bangalore");
		e1.setContact(8989898989L);
		System.out.println("Printing e1");
		e1.printEmployee();
		
		Employee e2 = new Employee(101, "Priya");
		e2.setAge(22);
		e2.setCity("Pune");
		e2.setContact(1234554321L);
		System.out.println("\nPrinting e2");
		e2.printEmployee();
		
		
		Employee e3=new Employee(103, "Dinesh", 23, "Chennai", 1234567890L);
		System.out.println("\nPrinting e3");
		e3.printEmployee();
		
		
		System.out.println("\nContact number of "+e1.getName()+" is "+e1.getContact());
		System.out.println("\nContact number of "+e2.getName()+" is "+e2.getContact());
		System.out.println("\nContact number of "+e3.getName()+" is "+e3.getContact());
	}
}
