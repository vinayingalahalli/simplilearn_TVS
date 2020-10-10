package eg1;

public class Demo1 {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);
		System.out.println(
				"i1 = " + i1 + " hashCode = " + i1.hashCode() + " memory Address = " + System.identityHashCode(i1));
		System.out.println(
				"i2 = " + i2 + " hashCode = " + i2.hashCode() + " memory Address = " + System.identityHashCode(i2));
		System.out.println(
				"i3 = " + i3 + " hashCode = " + i3.hashCode() + " memory Address = " + System.identityHashCode(i3));
		
		System.out.println("i1==i2 : "+(i1==i2));
		System.out.println("i1==i3 : "+(i1==i3));
		
		System.out.println("i1.equals(i2) : "+(i1.equals(i2)));
		System.out.println("i1.equals(i3) : "+(i1.equals(i3)));
		
		Integer i4=7;
		int x=i4; //autoboxing
		System.out.println("x : "+x);
		x=1000;
		i4=x; //autoboxing
		System.out.println("i4 : "+i4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.toBinaryString(101));
		System.out.println(Integer.toOctalString(101));
		System.out.println(Integer.toHexString(101));
		
		String s="18999";
		Integer s1=Integer.parseInt(s);
		System.out.println("s1 : "+s1);
		s1=9999999;
		s=s1+"";//anything in java can be converetd to string by just doing this
		System.out.println("s : "+s);
		
		Integer i5=100;
		System.out.println("i5 : "+i5);
		System.out.println("i5.compareTo(100) : "+i5.compareTo(100));
		System.out.println("i5.compareTo(10) : "+i5.compareTo(10));
		System.out.println("i5.compareTo(1000) : "+i5.compareTo(1000));
		
		
		
		Float f=i5.floatValue();
		System.out.println("f : "+f);
		f=77.88f;
		
		i5=f.intValue();
		System.out.println("i5 : "+i5);
		
//		Integer m=100;
//		m.

	}
//Same operations try with Float,Double and Long
}
