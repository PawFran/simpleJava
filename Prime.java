package topTen;

public class Prime {
	public static void print(Object o)
	{
		System.out.println(o);
	}
	public static void print()
	{
		System.out.println();
	}
	
	public static boolean isPrime(int n)
	{
		if(n == 2)
			return true;
		
		if(n % 2 == 0 || n == 1 || n == 0)
			return false;
		
		for(int i = 3; i <= Math.sqrt(n); i+= 2)
		{
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		isPrime(9);
		int count = 0;
		for(int i = 0; i <= 100; i++)
			if(isPrime(i))
			{	
				count++;
				print(i);
			}
		print();
		print(count);
	}
}
