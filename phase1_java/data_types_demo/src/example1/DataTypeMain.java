package example1;

public class DataTypeMain {

	public static void main(String[] args) {
		
		/*
		 * primitive data types
		 * It is a memory representation to hold any values
		 * 
		 * In Java we have 8 data types
		 * 
		 * datatype		memory_size(in bytes)		defaultValue
		 * byte			1(8bit)								0
		 * short		2(16bit)						0
		 * int			4(32bit)						0
		 * long			8(64bit)						0
		 * 
		 * decimal values
		 * --------------
		 * float		4(32bit)						0.00000f
		 * double		8(64bit)						0.00000d   
		 *java reads all the decimal values by default as double if you want float then use f explicitly
		 *
		 *char			2(16bit) 						'\u00000' (uni-code character set)	
		 *boolean       1bit							false							
		 */
		
		int x=100;
		System.out.println("value of x : "+x);
		
		char c='D';
		System.out.println("c : "+c);
		
		float f1=67.77f;
		System.out.println("f1 : "+f1);
		
		double d1=199.99d;
		System.out.println("d1 : "+d1);
		
		long contact=12345678909L;
		System.out.println("contact : "+contact);
		
		boolean b=true;
		System.out.println("b : "+b);
	}

}
