package topTen;

public class Factorial {
	public static void print(Object o)
	{
		System.out.println(o);
	}
	public static void print()
	{
		System.out.println();
	}
	
	public static long factorial(int n){
		if(n < 1)
			throw new IllegalArgumentException("positive number must be given");
		if(n == 1)
			return n;
		else
			return n * factorial(n - 1);				
	}
	
	public static void main(String args[])
	{		
		print(factorial(5));
	}
}
