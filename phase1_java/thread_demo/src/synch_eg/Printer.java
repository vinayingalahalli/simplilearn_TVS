package synch_eg;

public class Printer {

	public synchronized static void printPages(Paper paper) {
		
		System.out.print(paper.getPage1());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println();
		}
		System.out.println(" "+paper.getPage2());
	}
}
