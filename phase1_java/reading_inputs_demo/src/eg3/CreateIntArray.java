package eg3;

import java.util.Arrays;
import java.util.Scanner;



public class CreateIntArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int count=Integer.parseInt(sc.nextLine());
		int ar[]=new int[count];
		System.out.println("Enter "+count+" no of element/s");
		for (int i = 0; i < ar.length; i++) {
			//System.out.println("Enter "+(i+1)+" element");	
			ar[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("ar(before sorting) = "+Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("ar(after sorting) = "+Arrays.toString(ar));

	}

}
