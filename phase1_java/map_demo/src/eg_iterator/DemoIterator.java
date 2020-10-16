package eg_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoIterator {

	public static void main(String[] args) {
		Map<Integer, String> hm=new HashMap<>();
		hm.put(1211, "java");
		hm.put(1010, "java");
		hm.put(1991, "jee");
		hm.put(1222, "jdbc");
		hm.put(1422, "node");
		hm.put(5222, "spring");
		hm.put(3222, "hibernate");
		hm.put(4222, "jpa");
		hm.put(7222, "php");
		
		System.out.println("Map before deletion");
		System.out.println(hm);
		
//		for(Entry<Integer, String> e:hm.entrySet()) {
//			if(e.getValue().length()==3) {
//				hm.remove(e.getKey());
//			}
//		}
		Iterator<Entry<Integer, String>> i=hm.entrySet().iterator(); //if list or set then directly like listobject.iterator()
		
		while(i.hasNext()) {
			Entry<Integer, String> e=i.next();  //next() will do read and increment for us
			if(e.getValue().length()==3) {
				i.remove();
			}
		}
		System.out.println("Map after deletion");
		System.out.println(hm);
	}

}
/*Enumerator read only from top to bottom
 * has a child Iterator -> read and remove from top to bottom
 * has a child ListIterator -> add, read and remove but only on List and also is bidirectional
 * 
 */
