import java.util.Scanner;

public class Person
{
	String name;
	int id;
}

public class Employee extends Person
{
	int exp;
	double salary;

	public void setID(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSal(double salary)
	{
		this.salary = salary;
	}

	public void setExp(int exp)
	{
		this.exp = exp;
	}
	
	public int getID()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getSal()
	{
		return salary;
	}

	public int getExp()
	{
		return exp;
	}

	public int increment()
	{
	}
}

public class Person_Employee{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		emp.setID(100);
		emp.getName();
		emp.setName("Shweta");
		emp.getName();
		emp.setExp(4);
		emp.getExp();
		emp.setSal(40000);
		emp.getSal();
	}
}
