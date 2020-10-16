package ex2;

public class Bus implements Comparable<Bus> {

	private int id;
	private String name;
	private double cost;
	private float rating;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String name, double cost, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", name=" + name + ", cost=" + cost + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Bus o) {
		Integer id1=this.id;
		Integer id2=o.id;
		return id1.compareTo(id2);
	}
	
}
