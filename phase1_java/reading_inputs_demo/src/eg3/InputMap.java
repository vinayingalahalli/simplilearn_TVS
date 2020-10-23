package eg3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer, String> map=new HashMap<>();
		
		System.out.println("Enter number of key-value pairs for the MAP");
		int count=Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Key Value Pair -  "+(i+1));
			System.out.println("Enter Key");
			Integer key=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Value");
			String value=sc.nextLine();
			map.put(key, value);
		}
		System.out.println(map);
		

	}

}
