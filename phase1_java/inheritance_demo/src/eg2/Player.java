package eg2;

public class Player extends Person {

	private int age;
	private String teamName;
	private double averageScore;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int age, String teamName, double averageScore) {
		super(id, name);
		this.age = age;
		this.teamName = teamName;
		this.averageScore = averageScore;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	@Override
	public String toString() {
		return "Player [age=" + age + ", teamName=" + teamName + ", averageScore=" + averageScore + ", Id ="
				+ getId() + ", Name = " + getName() + "]";
	}
	
	
	
}
