package eg1;

public abstract  class EMS {

	public abstract void addEmployee();
	public abstract void updateEmployee();
	public abstract void removeEmployee();
	public abstract void getEmployeeById();
	
	
	public void commonEmployeeBenifits() {
		System.out.println("Common emp benifits for All employess in the world");
	}
}
