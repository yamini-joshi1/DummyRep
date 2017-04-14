package lecture_3;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int dec = 0, bin = 0, dig = 0, t = 1;
		
		System.out.println("Enter the decimal number:");
		dec = scn.nextInt();
		
		while(dec != 0)
		{
			int a = 0;
			a = dec % 2;
			bin = a*t + bin;
			dec /= 2;
			t *= 10;
		}
		
		System.out.println("The binary conversion of the number is " +bin);
		
	}

}
