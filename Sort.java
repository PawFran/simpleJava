package other;

public class Sort {
	public static void print(Object o)
	{
		System.out.println(o);
	}
	public static void print()
	{
		System.out.println();
	}
	public static void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean checkSorted(int[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			if(a[i + 1] < a[i])
				return false;
		}
		
		return true;
	}
	
	public static int[] randomArray(int size, int max, int min)
	{
		int[] arr = new int[size];		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * ((max - min) + 1)) + min;
		}
		
		return arr;		
	}
	
	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void BubbleSort(int[] a)
	{
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			boolean swap = false;
			for(int j = 0; j < n - i - 1; j++)
			{
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
					swap = true;
				}
			}
			if(!swap)
				break;
		}
	}
	
	public static void SelectionSort(int[] a)
	{
		int n = a.length;
		for(int i = 0; i < n; i++)
		{
			int min = i;
			for(int j = i; j < n; j++)
			{
				if(a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
	}
	
	public static void InsertionSort(int[] a)
	{
		int n = a.length;
		if(n < 2)
			return;
		for(int i = 1; i < n; i++)
		{
			int j = i;
			while(j > 0 && a[j] < a[j-1])
			{
				swap(a, j, j - 1);
				j--;
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = randomArray(10, 0, 100);
		print("Bubble sort");
		print(arr);
		BubbleSort(arr);
		if(!checkSorted(arr))
			print("error!");
		print(arr);
		
		arr = randomArray(10, 0, 100);
		print("Selection sort");
		print(arr);
		SelectionSort(arr);
		if(!checkSorted(arr))
			print("error!");
		print(arr);
		
		arr = randomArray(10, 0, 100);
		print("Insertion sort");
		print(arr);
		InsertionSort(arr);
		if(!checkSorted(arr))
			print("error!");
		print(arr);
	}
}
