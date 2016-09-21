package topTen;

public class Swap {
	public static void print(Object o)
	{
		System.out.println(o);
	}
	public static void print()
	{
		System.out.println();
	}
	// swap two variables without using third
	public static void swap(int a, int b)
	{
		System.out.println(a + ", " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + ", " + b);
	}
	
	public static void main(String[] args)
	{
		swap(2, 3);
	}
}
