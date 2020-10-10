package eg_regex;

public class PanCardRegexStyleDemo {

	public static void main(String[] args) {
		String pan = "ADEW#1954I";

		if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println(pan + " is valid PAN");
		} else {
			System.out.println(pan + " is not a valid PAN");
		}

	}

}
//Try validating all the govt issued cards to you(license, aadhar, voter, ration, gas bill)