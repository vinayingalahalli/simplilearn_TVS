package eg_regex;

public class RegExDemo {

	public static void main(String[] args) {
	
		/*
		 * Regular Expression(Reg-Ex) - is a pattern matching algorithm or pattern matcher which
		 *    checks for specific pattern in a String and helps you solve validation problems easily.
		 *    
		 *    Wild Cards
		 *    ------------
		 *    [] - represents pattern
		 *    a-z - represents lower case letters
		 *    A-Z - uppercase letters
		 *    a-zA-Z - any alphabet of any case
		 *    0-9 - digits
		 *    {} - length
		 *    ^ - not
		 *    [a-z]{5} - any lowercase letters of length 5
		 *    [A-Z]{1,} - min 1 uppercase letter and max can be any
		 *    [a-zA-Z0-9]{4,9} - any alphanumeric between length 4 and 9 only
		 *    [^a-zA-Z0-9] - apart from alphanumeric anything else is accepted
		 */
		
		String s="Qus sd1   23  11* *QAsfh) @#.2UU";
		System.out.println(s.replaceAll("[^a-zA-Z]", ""));
		System.out.println(s.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[ a-zA-Z0-9]", ""));

	}

}
