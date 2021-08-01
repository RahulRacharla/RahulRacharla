package palindrome;

public class Palindrom
{
	public static void main(String[] args)
	{
		String s ="Hi revature my self wow";
		String arr[] = s.split(" "); 
		 for (int i = 0; i < arr.length; i++) 
		 {
			 StringBuffer sb = new StringBuffer(arr[i]);
			 System.out.println(sb.reverse()+" ");
		 }
	}
			 
			 
			 
		
}		

