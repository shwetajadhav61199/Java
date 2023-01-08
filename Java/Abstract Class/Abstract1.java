abstract class Airplane
{
	abstract void no_of_passengers();
}

class B747 extends Airplane
{
	public void no_of_passengers()
	{
		System.out.println("No of Passengers are 100!");
	}
}

class B757 extends Airplane
{
	public void no_of_passengers()
	{
		System.out.println("No of Passengers are 100!");
	}
}

class B767 extends Airplane
{
	public void no_of_passengers()
	{
		System.out.println("No of Passengers are 100!");
	}
}

class Abstract1
{
	public static void main(String args[])
	{
		Airplane a = new B747();
		a.no_of_passengers();
		Airplane b = new B757();
		b.no_of_passengers();
		Airplane c = new B767();
		c.no_of_passengers();
	}
}
