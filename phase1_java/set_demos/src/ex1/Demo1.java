package ex1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("hello");
		hs.add(null);
		hs.add(null);
		hs.add("hi");
		hs.add("hello");
		hs.add("java");
		hs.add("jme");
		hs.add("jse");
		hs.add("jee");
		hs.add("hibernate");
		hs.add("spring");
		System.out.println("hs = "+hs);
		
		Set<String> lhs=new LinkedHashSet<>();
		lhs.add("hello");
		lhs.add("hello");
		lhs.add(null);
		lhs.add(null);
		lhs.add("hi");
		lhs.add("hello");
		lhs.add("java");
		lhs.add("jme");
		lhs.add("jse");
		lhs.add("jee");
		lhs.add("hibernate");
		lhs.add("spring");
		System.out.println("lhs = "+lhs);
		
	//	Set<String> ts=new TreeSet<>(); //maintains in ascending order
		Set<String> ts=new TreeSet<>(Collections.reverseOrder()); // does this in descending
		ts.add("hello");
		ts.add("hello");
		//ts.add(null);
		//ts.add(null);
		ts.add("hi");
		ts.add("hello");
		ts.add("java");
		ts.add("jme");
		ts.add("jse");
		ts.add("jee");
		ts.add("hibernate");
		ts.add("spring");
		System.out.println("ts = "+ts);
		
		System.out.println("ts.size() : "+ts.size());
		System.out.println("ts.contains(\"hello\") : "+ts.contains("hello"));
		System.out.println("ts.contains(\"web\") : "+ts.contains("web"));
		
		ts.remove("jme");
		System.out.println("ts = "+ts);
		
		//since Set is unindexed we cannot use normal for loop to iterate
		System.out.println("\nIterating using for each loop");
		for(String s:ts) {
			System.out.println(s.toUpperCase());
		}

	}

}
