package lecture_3;

import java.util.Scanner;

public class FarToCel {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int min=0,max=0,step=0,cel=0,far=0;
		System.out.println("Enter the value of min");
		min=scn.nextInt();
		System.out.println("Enter the value of max");
		max=scn.nextInt();
		System.out.println("Enter the value of step");
		step=scn.nextInt();
		far=min;
		while(far<=max)
		{
			cel=(int)((5.0/9)*(far-32));
			System.out.println(far+ "\t" +cel);
			far=far+step;
		}
	}

}
