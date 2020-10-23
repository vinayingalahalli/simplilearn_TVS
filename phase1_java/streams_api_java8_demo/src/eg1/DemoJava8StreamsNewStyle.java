package eg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoJava8StreamsNewStyle {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "c2", "b1", "b2", "b3", "c1", "c4", "c3", "a2", "a3", "chennai",
				"coimbatore", "calcutta");
		System.out.println("Before : " + myList);
		myList
		.stream()
		.filter(s -> s.startsWith("c"))
		.map(s -> s.toUpperCase())
		.sorted()
		.forEach(s->System.out.print(s+" "));
		
		
		List<Integer> myList2=Arrays.asList(12,11,11,22,33,11,33,44,555,11,33,44);
		
		List<Integer> evenList=myList2.stream().filter(i->(i%2)==0).collect(Collectors.toList());
		System.out.println("\nevenList : "+evenList);
		List<Integer> oddList=myList2.stream().filter(i->(i%2)!=0).collect(Collectors.toList());
		System.out.println("\noddList : "+oddList);
		
		
	}

}
