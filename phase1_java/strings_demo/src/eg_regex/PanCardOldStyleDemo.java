package eg_regex;

public class PanCardOldStyleDemo {

	public static void main(String[] args) {
		String pan="ADEWE1954W";
		
		boolean b=false;
		
		if(pan.length()==10 && Character.isUpperCase(pan.charAt(9))) {
			
			int upper=0;
			for (int i = 0; i < 5; i++) {
				if(Character.isUpperCase(pan.charAt(i))) {
					upper++;
				}
			}
			if(upper==5) {
				int digit=0;
				for (int i = 5; i < 9; i++) {
					if(Character.isDigit(pan.charAt(i))) {
						digit++;
					}
				}
				if(digit==4) {
					b=true;
				}
			}
		}
		
		if(b) {
			System.out.println(pan+" validated");
		}else {
			System.out.println(pan+" is not a valid PAN");
		}

	}

}
