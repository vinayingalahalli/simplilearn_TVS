package eg2;

public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private long contact;
	private char gender;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double salary, long contact, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.contact = contact;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + hashCode() + ", name=" + name + ", age=" + age + ", salary=" + salary + ", contact=" + contact
				+ ", gender=" + gender + "]";
	}
	
}
