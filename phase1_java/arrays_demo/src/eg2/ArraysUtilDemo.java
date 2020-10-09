package eg2;

import java.util.Arrays;

public class ArraysUtilDemo {

	public static void main(String[] args) {
		int ar1[] = { 12, 33, 11, 23, 12, 33, 11, 23, 66, 23, 11, 22, 33, 23 };
		System.out.println(ar1);
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(ar1));
		
		//sorting
		Arrays.sort(ar1);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar1));
		
		//binarySearch - performs searching by doing divide and conquer approach
		//make sure before performing binarySearch() let your array be sorted in ascending order only.
		
		System.out.println(Arrays.binarySearch(ar1, 100));
		System.out.println(Arrays.binarySearch(ar1, 33));
		
		int ar2[]=Arrays.copyOf(ar1, ar1.length+10);
		System.out.println("ar2 = "+Arrays.toString(ar2));
		
		Arrays.fill(ar2, 10000);
		System.out.println("ar2 = "+Arrays.toString(ar2));
		
		Arrays.fill(ar2, 4, 9, 88);
		System.out.println("ar2 = "+Arrays.toString(ar2));
	}

}
