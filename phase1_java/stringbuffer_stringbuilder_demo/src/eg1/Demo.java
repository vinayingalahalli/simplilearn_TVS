package eg1;

public class Demo {

	public static void main(String[] args) {
	
		StringBuffer sb1=new StringBuffer("hello");
		System.out.println("sb1 = "+sb1);
		sb1.append(" heyy").append(1232).append(121.22f).append(true);
		System.out.println(sb1);
		sb1.insert(2, "JAVA");
		System.out.println(sb1);
		
		sb1.delete(4, 8);
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("JAVA");
		StringBuffer sb3=new StringBuffer("JAVA");
		System.out.println(sb2.equals(sb3));
		System.out.println(sb2.toString().equals(sb3.toString()));

	}

}
