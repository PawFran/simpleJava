package topTen;

public class StringReplace {
	public static String replace(String s, char old, char replace)
	{
		char[] array = s.toCharArray();
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == old)
				array[i] = replace;
		}
		
		return new String(array);
	}
	
	public static void main(String[] args){
		String test = "ababaccccacb";
		System.out.println(replace(test, 'b', 'p'));
	}
}
