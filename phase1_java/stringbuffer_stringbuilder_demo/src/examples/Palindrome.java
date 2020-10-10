package examples;

public class Palindrome {

	public static void main(String[] args) {
	
		String s="malayalam";
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s1=sb.toString();
		if(s.equals(s1)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not a palindrome");
		}
		
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not a palindrome");
		}
		
		int x=11011;
		s=x+"";
		if(new StringBuffer(s).reverse().toString().equals(s)) {
			System.out.println(s+" is palindrome");
		}else {
			System.out.println(s+" is not a palindrome");
		}
	}

}
