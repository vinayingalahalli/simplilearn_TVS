package ex2;

import java.util.HashSet;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {
		Set<Bus> busList=new HashSet<>();
		busList.add(new Bus(100, "abc travels", 1200.11, 3.33f));
		busList.add(new Bus(901, "abc travels", 1300.11, 4.33f));
		busList.add(new Bus(200, "xyz travels", 1100.11, 3.33f));
		busList.add(new Bus(400, "java travels", 900.11, 3.33f));
		busList.add(new Bus(120, "jee travels", 1400.11, 4.63f));
		busList.add(new Bus(301, "java travels", 1200.11, 3.33f));
		busList.add(new Bus(199, "abc travels", 1100.11, 1.33f));
		busList.add(new Bus(301, "java travels", 1200.11, 3.33f));
		busList.add(new Bus(199, "abc travels", 1100.11, 1.33f));
		
		System.out.println("Printing all the buses");
		printBuses(busList);

	}
	
	public static void printBuses(Set<Bus> busList) {
		for(Bus b:busList) {
			System.out.println(b);
		}
	}

}
