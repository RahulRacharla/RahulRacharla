package prob1;
 import java.util.*;

public class prob1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(result(s));
	}
	public static String result(String s) {
		int x=s.indexOf("//");
		int y=s.indexOf("/",8);
		return(s.substring(x+2,y));
	}

}
