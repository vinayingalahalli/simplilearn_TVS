package eg1;

public class Main {

	public static void main(String[] args) {
		
		EMS ems=new SimpliLearnEMS();
		System.out.println("Accessing EMS for SimplilearnEmployees");
		ems.addEmployee();
		ems.commonEmployeeBenifits();
		ems.updateEmployee();
		ems.getEmployeeById();
		ems.removeEmployee();
		
		
		EMS tvsEms=new TVSEms();
		System.out.println("\n\nAccessing EMS for TVS Emps");
		tvsEms.addEmployee();
		tvsEms.updateEmployee();
		tvsEms.getEmployeeById();
		tvsEms.commonEmployeeBenifits();
		tvsEms.removeEmployee();

	}

}
