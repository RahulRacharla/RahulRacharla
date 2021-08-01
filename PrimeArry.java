package prime;
import java.util.Scanner;
public class PrimeArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split("");
		for (int i = 0; i < arr.length; i++) {
			int m= Integer.parseInt(arr[i]);
			if(m==2) {
				System.out.println(arr[i]+"");
				continue;
			}
			for(int j=2;j<(m/2)+1;j++) {
				if(m%2==0)
				{
					break;
				}
				if(j==(m/2)+1) {
					System.out.println(arr[i]="");
				}
				
			}
			
			
			
			
			
			
			
		}
	}

}
