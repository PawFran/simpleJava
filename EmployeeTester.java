package topTen;

import java.util.*;

public class EmployeeTester {
	
	public static void print(List<Employee> a)
	{
		for(int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));
	}
	
	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList();		
		list.add(new Employee("aaa", "first dep.", 27));
		list.add(new Employee("bbb", "second dep.", 21));
		list.add(new Employee("ccc", "first dep.", 32));		
		print(list);
		
		System.out.println();
		Collections.sort(list, new AgeComparator());
		print(list);
		
		System.out.println();
		Collections.sort(list, new NameComparator());
		print(list);
	}
}	
