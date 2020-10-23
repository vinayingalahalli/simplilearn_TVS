package eg1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoOldStyle {
	public static void main(String[] args) {
		List<String> myList=Arrays.asList("a1","c2","b1","b2","b3","c1","c4","c3","a2","a3","chennai","coimbatore","calcutta");
		//I wish to print all the elements which starts from c in uppercase and also sorted by the alpha order
		
		System.out.println("Before : "+myList);
		for(int i=0;i<myList.size();i++) {
			if(myList.get(i).startsWith("c")) {
				myList.set(i, myList.get(i).toUpperCase());
			}
		}
		Collections.sort(myList);
		System.out.println("After : "+myList);
	}
}
