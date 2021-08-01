package upperProg2;

import java.util.Scanner;

public class upperProg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(convertmidlettertouppercase(s));

	}
	public static String convertmidlettertouppercase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if(ar[w].length()%2==1) {
				sb.append(ar[w].substring(0,(ar[w].length())/2)).append(Character.toUpperCase(ar[w].charAt(ar[w].length()/2))).
				append(ar[w].substring(ar[w].length()/2+1,ar[w].length())).append(" ");
			}else {
				sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
			}
				}
		return sb.toString().trim();	
	}

}
