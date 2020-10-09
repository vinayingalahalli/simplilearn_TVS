package eg2;

public class SearchingDemo {

	public static void main(String[] args) {
		int ar1[] = { 12, 33, 11, 23, 12, 33, 11, 23, 66, 23, 11, 22, 33, 23 };
		int searchElement = 11;

		boolean b = false;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == searchElement) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println(searchElement + " found");
		} else {
			System.out.println(searchElement + " not found");
		}
		
		
		b=false;
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] == searchElement) {
				b = true;
				System.out.println(searchElement+ " found in position "+(i+1));
			}
		}
		if (!b) {
			System.out.println(searchElement + " not found");
		}
	}

}
