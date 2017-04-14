package lecture_3;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
Scanner scn = new Scanner(System.in);
		
		int dec = 0, bin = 0, dig = 0, t = 1;
		
		System.out.println("Enter the binary number:");
		bin = scn.nextInt();
		
		while(bin != 0)
		{
			int a = 0;
			a = bin % 10;
			dec = a*t + dec;
			bin /= 10;
			t *= 2;
		}
		
		System.out.println("The decimal conversion of the number is " +dec);

	}

}
