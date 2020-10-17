package eg2;

public class Employee extends Person {

	private String designation;
	private Project project;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, Project project, double salary) {
		super(id, name);
		this.designation = designation;
		this.project = project;
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", project=" + project + ", salary=" + salary + ", Id ="
				+ getId() + ", Name = " + getName() + "]";
	}
	
	
}
