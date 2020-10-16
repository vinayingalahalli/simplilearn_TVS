package ex2;

import java.util.Comparator;

public class BusCostComparator  implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		Double d1=o1.getCost();
		Double d2=o2.getCost();
		return d2.compareTo(d1);
	}

}
