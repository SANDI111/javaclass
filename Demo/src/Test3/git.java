package Test3;

import java.util.Scanner;

public class git {
	
	public static void main (String []args)
	
	{
		int a,b;
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter 2 number");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping - a: "+ a +", b: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
	   // System.out.println("after swapping value of +a AND +B");
	    System.out.println("After swapping  - a: "+ a +", b: " + b);
		
		
		
		
	}
	

}
