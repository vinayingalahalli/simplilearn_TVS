package eg1;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		
		System.out.println("s1==s2 : "+(s1==s2));
		System.out.println("s1==s3 : "+(s1==s3));
		
		System.out.println("s1.equals(s2) : "+(s1.equals(s2)));
		System.out.println("s1.equals(s3) : "+(s1.equals(s3)));
		
		System.out.println("s1.equals(\"HEllo\") : "+(s1.equals("HEllo")));
		System.out.println("s1.equalsIgnoreCase(\"HEllo\") : "+(s1.equalsIgnoreCase("HEllo")));
		
		
		System.out.println("s1.length() : "+s1.length());
		System.out.println("s1.charAt(0) : "+s1.charAt(1));
		System.out.println("Printing all chars using loop");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		char c[]=s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("s1.contains(\"l\") : "+s1.contains("l"));
		System.out.println("s1.contains(\"ll\") : "+s1.contains("ll"));
		System.out.println("s1.contains(\"lol\") : "+s1.contains("lol"));
		
		String s4="      data       ";
		System.out.println("s4 : "+s4);
		System.out.println("s4.trim() : "+s4.trim());
		System.out.println("s4 : "+s4);
		s4=s4.trim();
		System.out.println("s4 : "+s4);
		System.out.println("s4.toUpperCase() : "+s4.toUpperCase());
		System.out.println("s4 : "+s4);
		
		System.out.println("s1.substring(1) : "+s1.substring(1));
		System.out.println("s1.substring(1,3) : "+s1.substring(1,3));
		
		s4="hello hi good afternoon everyone";
		String s5[] =s4.split(" ");
		for (int i = 0; i < s5.length; i++) {
			System.out.println(s5[i].toUpperCase());
		}
	}

}
