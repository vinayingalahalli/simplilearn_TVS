package example2;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String city;
	private long contact;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
	
	public long getContact() {
		return contact;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Employee(int id, String name, int age, String city, long contact) {
		this(id,name); //constructor chaining
		this.age = age;
		this.city = city;
		this.contact = contact;
	}

	public void printEmployee() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Contact : "+contact);
	}
	
}
