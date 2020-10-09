package eg1;

public class Demo1 {

	public static void main(String[] args) {

		int ar1[] = { 12, 33, 11, 23, 12, 33, 11, 23, 66 };

		System.out.println("ar1[0] = " + ar1[0]);

		ar1[0] = 99;

		System.out.println("ar1[0] after update = " + ar1[0]);

		System.out.println("Printing all the data using for loop from top to bottom");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("ar1[" + i + "] = " + ar1[i]);
		}
		
		System.out.println("Printing all the data using for loop from bottom  to top");
		for (int i = ar1.length-1; i >=0; i--) {
			System.out.println("ar1[" + i + "] = " + ar1[i]);
		}
	}

}
