package eg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
	
		Map<Integer, String> hm=new HashMap<>();
		hm.put(1211, "java");
		hm.put(1010, "java");
		hm.put(1010, "updated");
		hm.put(null, "jee");
		hm.put(1222, null);
		hm.put(1422, null);
		hm.put(5222, "spring");
		hm.put(3222, "hibernate");
		hm.put(4222, "jpa");
		hm.put(7222, null);
		
		System.out.println("hm : "+hm);
		
		
		Map<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1211, "java");
		lhm.put(1010, "java");
		lhm.put(1010, "updated");
		lhm.put(null, "jee");
		lhm.put(1222, null);
		lhm.put(1422, null);
		lhm.put(5222, "spring");
		lhm.put(3222, "hibernate");
		lhm.put(4222, "jpa");
		lhm.put(7222, null);
		
		System.out.println("lhm : "+lhm);
		
		Map<Integer, String> tm=new TreeMap<>();
		tm.put(1211, "java");
		tm.put(1010, "java");
		tm.put(1010, "updated");
	//	tm.put(null, "jee");
		tm.put(1222, null);
		tm.put(1422, null);
		tm.put(5222, "spring");
		tm.put(3222, "hibernate");
		tm.put(4222, "jpa");
		tm.put(7222, null);
		
		System.out.println("tm : "+tm);
		
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(1211, "java");
		ht.put(1010, "java");
		ht.put(1010, "updated");
	//	ht.put(null, "jee");
	//	ht.put(1222, null);
	//	ht.put(1422, null);
		ht.put(5222, "spring");
		ht.put(3222, "hibernate");
		ht.put(4222, "jpa");
	//	ht.put(7222, null);
		
		System.out.println("ht : "+ht);
		
		System.out.println("ht.size() : "+ht.size());
		
		System.out.println("ht.get(100) : "+ht.get(100));
		
		System.out.println("ht.get(1211) : "+ht.get(1211));
		
		
		System.out.println("ht.containsKey(100) : "+ht.containsKey(100));

		System.out.println("ht.containsKey(1211) : "+ht.containsKey(1211));
		
		System.out.println("ht.containsValue(\"java\") : "+ht.containsValue("java"));
		System.out.println("ht.containsValue(\"jme\") : "+ht.containsValue("jme"));
		
		ht.remove(1010);
		System.out.println("ht(after remove) : "+ht);
		
		System.out.println("ht.keySet() : "+ht.keySet());
		System.out.println("ht.values() : "+ht.values());
		
		System.out.println("\nIterating Map using keySet()");
		Set<Integer> set=ht.keySet();
		for(Integer i : set) {
			System.out.println("Key = "+i+" Value = "+ht.get(i));
		}
		
		System.out.println("\nIterating Map using entrySet() (recommended)");
		for(Entry<Integer, String> e:ht.entrySet()) {
			System.out.println("Key -> "+e.getKey()+" Value -> "+e.getValue());
		}

	}

}
