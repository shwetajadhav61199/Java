abstract class abc
{
	abstract void a();
}

class pqr extends abc
{
	abstract void a();
	final void a()
	{
		System.out.println("Hello from x!");
	}
}

class AbstractFinal
{
	public static void main(String args[])
	{
		pqr p = new pqr();
		p.a();
		p.x();
	}
}
