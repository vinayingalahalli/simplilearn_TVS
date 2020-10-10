package eg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList();
		li.add("hey");
		li.add(100);
		li.add(44.44);
		li.add(true);
		li.add('A');
		li.add("hello");
		System.out.println("li = "+li);
		
		LinkedList<Integer> li2=new LinkedList<>(); //never ever do this
		li2.add(12322);
		li2.add(12322);
		li2.add(120);
		li2.add(12320);
		li2.add(400);
		System.out.println("li2 = "+li2);
		
		
		List<Integer> li3=new LinkedList<>(); //foloow this, this is the best practice
		li3.add(222);
		li3.add(44);
		li3.add(2022);
		li3.add(404);
		li3.add(222);
		li3.add(44);
		li3.add(null);
		li3.add(44);
		li3.add(null);
		li3.add(null);
		li3.add(66);
		li3.add(21);
		System.out.println("li3 = "+li3);
		
		li3.add(2, 99); // adds at specific position
		System.out.println("li3 = "+li3);
		
		li3.set(2, 100); //updates at the specified position
		System.out.println("li3 = "+li3);
		
		System.out.println("li3.size() : "+li3.size());
		
		System.out.println("li3.get(0) : "+li3.get(0));// ar[0]
		
		System.out.println("Printing all elements using for loop");
		for (int i = 0; i < li3.size(); i++) {
			System.out.print(li3.get(i)+" ");
		}
		System.out.println("\nPrinting all elements using for-each loop");
		for(Integer i:li3) {
			System.out.print(i+" ");
		}
		
		li3.remove(0); //removes element from that position
		System.out.println("\nli3 = "+li3);
		
		Integer i=44;
		li3.remove(i); //removes the first occurance of that value
		System.out.println("li3 = "+li3);
		
		while(li3.remove(i)) {}
		System.out.println("li3 = "+li3);
		
		List<Integer> li4=new ArrayList<>(li3);
		System.out.println("li4 = "+li4);
		li4.addAll(li3);
		System.out.println("li4 = "+li4);
		
		List<Integer> li5=new Vector<>();
		li5.add(100);
		li5.add(null);
		li5.add(200);
		li5.add(44);
		li5.add(100);
		li5.add(21);
		li5.add(99);
		li5.add(47);
		System.out.println("li5 = "+li5);
		//li5.retainAll(li4);  //finds common between li5 and li4 and stores the result in li5
		li5.removeAll(li4); //contents of li5 which are not there in li4 remains rest will  be deleted
		System.out.println("li5 = "+li5);
		System.out.println("li5.contains(100) : "+li5.contains(100));
		System.out.println("li5.contains(200) : "+li5.contains(200));
		
	}

}
