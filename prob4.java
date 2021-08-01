package prob4;
import java.util.Scanner;
import java.io.*;

public class prob4 {
	 public static double triangle(int a,int b){
	        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	       // System.out.println(c);
	       return c;
	    }
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        
	        System.out.println(triangle(a,b));
	        
	    }

}
