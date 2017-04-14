package lecture_3;

public class Assgn_series {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int N = 20, i = 1, p = 1;
		while(p != N)
		{
			int s = 3*i + 2;
			if(s % 4 != 0)
			{
				System.out.print(s+ " ");
				p++;
			}
			i++;
		}
		
	}

}