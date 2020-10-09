package example3;

public class Player {

	//Player 'has-A' id, name and permanentAddress
	private int id;
	private String name;
	private Address permanetAddress; 
	//private Address presentAddress;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, Address permanetAddress) {
		super();
		this.id = id;
		this.name = name;
		this.permanetAddress = permanetAddress;
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

	public Address getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(Address permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	//Modifying toString() from the parent Object class to print the data as per our wish
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", permanetAddress=" + permanetAddress + "]";
	}
	
}
