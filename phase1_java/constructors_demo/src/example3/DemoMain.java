package example3;

public class DemoMain {

	public static void main(String[] args) {
		
		Address a=new Address(900, "XYZ Street", "Coimbatore", 69999);
		Player p=new Player(200, "Ashwin", a);
		System.out.println(p);
		System.out.println(p.toString()); //Java reads everything as String and writes everything as String 
	}

}
