interface a
{
	int no = 5;
	void abc();
}

class b implements a
{
	public void abc()
	{
		System.out.println("Hello from class b, abc called!"+no);
	}
}

interface c extends a
{
	void abc();
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		b obj = new b();
		obj.abc();
	}
}
