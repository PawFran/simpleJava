package topTen;

public class ReverseString {	
	public static void print(Object o)
	{
		System.out.println(o);
	}
	
	public static String reverse(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length() / 2; i++)
		{
			char current = sb.charAt(i);			
			char other = sb.charAt(s.length() - i - 1);
			sb.setCharAt(i, other);
			sb.setCharAt(s.length() - i - 1, current);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		System.out.println(reverse("example1"));
	}
}

