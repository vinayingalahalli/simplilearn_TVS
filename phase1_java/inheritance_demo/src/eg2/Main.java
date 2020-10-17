package eg2;

public class Main {

	public static void main(String[] args) {
		Player p=new Player(100, "Sachin R T", 45, "INDIA", 100);
		System.out.println(p);
		
		Project project=new Project(2121, "Some System", "Simplilearn");
		Employee e=new Employee(454, "Deepanshu", "TA", project, 123453.55d);
		
		System.out.println(e);
		
		Employee e2=new Employee(455, "Sourabh", "TA", project, 123222.66d);
		System.out.println(e2);

	}

}
