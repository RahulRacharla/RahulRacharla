package lastletteruppercase;

import java.util.Scanner;

public class lastletteruppercase {

	public static void main(String[] args) {
		
		/**String s="hello hi good noon hope we got thread safety";**/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(convertlastletteruppercase(s));
		
		

	}
	public static String convertlastletteruppercase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(ar[w].substring(0,ar[w].length()-1)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()-1))).append(" ");
		
	}
		return sb.toString();
	

}
}
