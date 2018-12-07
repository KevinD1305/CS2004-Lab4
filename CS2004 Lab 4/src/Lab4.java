public class Lab4 
{
	public static void main(String[] args)
	{
		
		int x[] =  randomArray(10);
		int ArrayA [] = new int[x.length];
	
		for (int i = 0; i < (x.length-1); i++)
		{
			int s = x[i];
			for (int j = 1; j < (x.length-1); j++)
			{
				if (j <= i)
				{
					s = s + x[j];
				}
			}
			ArrayA[i] =  (s/(i+1)); 
			System.out.println(ArrayA[i]);
			prefixes2(args);
		}
	}	
	
	public static void prefixes2(String[] args)
	{
		
		int x[] =  randomArray(10);
		int Arrayb [] = new int[x.length];
		int s = 0;
		
		for (int i = 0; i < (x.length-1); i++)
		{
			s = s + x[i];
			Arrayb[i] = (s/(i+1));
			System.out.print(Arrayb[i] + (", "));
		}
	
	}
	protected static int[] randomArray(int n) //0-100
	{
		int newRandom;
		newRandom = (CS2004.UI(0,100));
		int ArrayA [] = new int [n];
		
		for (int i = 0; i < n;i++)
		{
			newRandom = (CS2004.UI(0,100));
			ArrayA[i] = newRandom;
		}
		return ArrayA;
	}	
}
	
		
