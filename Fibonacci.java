package topTen;

public class Fibonacci {
	public static int fibonacciIteration(int n)
	{
		int a = 1;
		int b = 1;
		if(n == 1 || n == 2)
			return 1;
		
		int next = a + b;
		for(int i = 4; i <= n; i++)
		{
			next = next + b;
			a = b;
			b = next - b;			
		}
		
		return next;
	}
	
	public static int fibonacciRecursion(int n)
	{
		if(n == 1 || n == 2)
			return 1;
		else
			return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);			
	}
	
	public static void main(String[] args){
		System.out.println(fibonacciIteration(14));
		System.out.println(fibonacciRecursion(14));
	}
}
