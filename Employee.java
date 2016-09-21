package topTen;

public class Employee {
	
	String name;
	int age;
	String department;
	
	public Employee(String n, String d, int a){
		name = n;
		department = d;
		age = a;
	}
	
	public String toString()
	{
		return name + ", " + department + ", " + age;
	}
	
}
