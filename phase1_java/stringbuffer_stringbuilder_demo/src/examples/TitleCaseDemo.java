package examples;

public class TitleCaseDemo {

	public static void main(String[] args) {
		String s="vinay we are hungry please let us go for lunch";
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
//Task here - Convert last letter/character of every word to uppercase