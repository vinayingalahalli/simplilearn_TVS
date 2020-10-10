package eg_regex;

public class CharacterApiDemo {

	public static void main(String[] args) {
		String s="Qus sd1   23  11* *QAsfh) @#.2UU";
		int alpha=0,upper=0,lower=0,digit=0,alphaNum=0,spaces=0,special=0;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphaNum++;
			}
			if(Character.isWhitespace(c)) {
				spaces++;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				special++;
			}
		}
		System.out.println("Alphabets count = "+alpha);
		System.out.println("Upper count = "+upper);
		System.out.println("Lower count = "+lower);
		System.out.println("Digits count = "+digit);
		System.out.println("AlphanNumeric count = "+alphaNum);
		System.out.println("spaces count = "+spaces);
		System.out.println("Special char count = "+special);
	}

}
