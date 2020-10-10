package eg;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsUtilityDemo {

	public static void main(String[] args) {

		List<Integer> li5=new Vector<>();
		li5.add(100);
		li5.add(null);
		li5.add(200);
		li5.add(44);
		li5.add(100);
		li5.add(21);
		li5.add(99);
		li5.add(47);
		li5.add(null);
		li5.add(500);
		li5.add(null);
		li5.add(200);
		System.out.println("li5 = "+li5);
		Collections.shuffle(li5);
		System.out.println("li5 = "+li5);
		Collections.reverse(li5);
		System.out.println("li5 = "+li5);
		Collections.replaceAll(li5, null, -1);
		System.out.println("li5 = "+li5);
		Collections.sort(li5); //ascending
		System.out.println("li5 = "+li5);
		//Before doing bnarySearch pleae make sure your Collection is sorted in ascending order
		System.out.println("Collections.binarySearch(li5, 100) : "+Collections.binarySearch(li5, 100));
		System.out.println("Collections.binarySearch(li5, 99999) : "+Collections.binarySearch(li5, 99999));
		
		
		Collections.sort(li5, Collections.reverseOrder()); //does the sort in descending
		System.out.println("li5 = "+li5);
		
	}

}
