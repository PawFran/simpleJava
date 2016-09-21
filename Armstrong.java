package topTen;

public class Armstrong {
	// number that is the sum of its own digits
	//each raised to the power of the number of digits
	private static int nthDigit(int a, int n)
	{		
		return (a % (int)Math.pow(10, n)) / (int)Math.pow(10, n - 1);
	}
	
	public static boolean isArmstrong(int n)
	{
		String number = ((Integer)n).toString();
		int numOfDigits = number.length();
		long sumDigits = 0;		
		for(int i = 1; i <= numOfDigits; i++)
		{
			sumDigits += Math.pow(nthDigit(n, i), numOfDigits);
		}
//		System.out.println("sum of digits: " + sumDigits);
		
		return sumDigits == n;
	}
	
	public static void main(String[] args){
		System.out.println(isArmstrong(100));
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(370));
		System.out.println(isArmstrong(371));
		System.out.println(isArmstrong(407));
//		System.out.println(nthDigit(123, 2));

	}
}
