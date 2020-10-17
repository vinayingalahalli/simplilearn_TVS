package override_object_class_object_casting;

public class Customer {

	private int id;
	private String name;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean b=false;
		Customer c=(Customer)o;
		System.out.println("this.id (c1)= "+this.id);
		System.out.println("c.id (c2)= "+c.id);
		if(this.id==c.id) {
			b=true;
		}
		return b;
	}
	
}
