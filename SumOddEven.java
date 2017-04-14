package lecture_3;

import java.util.Scanner;

public class SumOddEven 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sumOdd = 0, sumEven = 0;
		int num =0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num=scn.nextInt();
		
		while(num>0)
		{
			int a = num%10;
			if(a % 2 == 0)
				sumEven += a;
			else
				sumOdd += a;
			num /= 10; 
		}
		
		System.out.println("The sum of even digits is:" +sumEven);
		System.out.println("The sum of odd digits is:" +sumOdd);
		
	}

}
