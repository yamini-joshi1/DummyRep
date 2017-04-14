package lecture_3;

import java.util.Scanner;

public class NumRev {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int num=0,rev=0;
		
		System.out.println("Enter the number:");
		num = scn.nextInt();
		
		while(num != 0)
		{
			int a=0;
			a = num % 10;
			rev = rev * 10 +a;
			num = num/10;
		}
		System.out.println("The reverse of the number is " +rev);
	}

}
