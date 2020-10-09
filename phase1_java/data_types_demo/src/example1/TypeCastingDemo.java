package example1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		/*
		 * Type Casting - Conversion of one data type to another data type is what is called as type casting
		 * There are 2 ways
		 * 1)Implicit Casting - which is taken care by the java compiler by default for when we assign the data type
		 *                      of smaller in size to larger in size.
		 * 2)Explicit Casting - which we programmers have to do explicitly from larger type to the smaller type
		 */

		char c='K';
		int x=c; //implicit casting
		System.out.println("x = "+x);
		
		float f=x;//implicit casting
		System.out.println("f = "+f);
		
		f=88.77f;
		x=(int)f;
		System.out.println("x : "+x);
		
		c=(char)x;
		System.out.println("c : "+c);
		
		
		
	}

}
