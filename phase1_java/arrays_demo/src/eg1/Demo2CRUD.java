package eg1;

public class Demo2CRUD {

	public static void main(String[] args) {
		int ar1[]=new int[10];
		ar1[0]=100;
		ar1[1]=99;
		ar1[2]=11;
		ar1[3]=45;
		ar1[4]=88;
		
		System.out.println("Printing contents of the array using for loop");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println("\nPrinting contents of the array using for each loop");
		for (int i :ar1) {
			System.out.print(i+" ");
		}
		
		int n=5;
		System.out.println("\nPrinting contents of the array using for loop with n before insert");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		int element=555;
		int pos=2;
		
		for(int i=n;i>=pos;i--) {
			ar1[i]=ar1[i-1];
		}
		ar1[pos-1]=element;
		n++;
		System.out.println("\nPrinting contents of the array using for loop with n after insert");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		int delPos=3;
		for (int i = delPos-1; i < n; i++) {
			ar1[i]=ar1[i+1];
		}
		n--;
		System.out.println("\nPrinting contents of the array using for loop with n after deletion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar1[i]+" ");
		}
		
		
	}

}
