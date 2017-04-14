package lecture_3;

import java.util.Scanner;

public class sumOrProd 
{
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0,N=0;
		System.out.println("Enter the number:");
		N=scn.nextInt();
		System.out.println("Enter the operation to be performed:\n\t1.Addition\n\t2.Product");
		a = scn.nextInt();
		if(a==1)
		{
			System.out.println("The sum is " + sum(N));
		}
		else
		{
			System.out.println("The product is " + product(N));
		}

	}
	public static int sum(int num)
	{
		int retVal=0,i=1;
		while(i<=num)
		{
			retVal+=i;
			i++;
		}
		return retVal;
	}
	public static int product(int num)
	{
		int retVal=1,i=1;
		while(i<=num)
		{
			retVal*=i;
			i++;
		}
		return retVal;
	}

}
