package reverse;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			if( new StringBuilder(ar[w]).reverse().toString().equals(ar[w])) {
				sb.append(ar[w]);
			}else
			{
				StringBuilder s2=new StringBuilder(ar[w]);
				sb.append(s2.reverse()).append(" ");
			}
		}
		return sb.toString().trim();
	}
	

}
