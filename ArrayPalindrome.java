package arraypalin;
import java.util.Scanner;
public class ArrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			StringBuffer sb = new StringBuffer(arr[i]);
			if(sb.toString().equals(sb.reverse().toString())) {
				System.out.println(sb+"");
			}
			else
			{
				System.out.println("not palindrom");
			}
				
			
		}

	}

}
