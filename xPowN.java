package lecture_3;

import java.util.Scanner;

public class xPowN {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N=0,X=0,pow=1,num=1;
		System.out.println("Enter the number and the power:");
		X = scn.nextInt();
		N = scn.nextInt();
		for(pow=1; pow <= N; ++pow)
		{
			num *= X;
		}
		System.out.println("The answer is " +num);
		
	}

}
