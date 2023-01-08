//(JAVA) (OOCP)
class Parenthesis
{
	void display(String s)
	{
		System.out.print("("+s);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ie){}
		System.out.print(")");
	}
}

class SyncDemo extends Thread
{
	String s;
	Parenthesis p;
	public SyncDemo(Parenthesis p,String s)
	{
		this.p = p;
		this.s = s;
		start();
	}
	public void run()
	{
		p.display(s);
	}
	
	public static void main(String args[])
	{
		Parenthesis p = new Parenthesis();
		SyncDemo s1 = new SyncDemo(p,"Java");
		SyncDemo s2 = new SyncDemo(p,"OOCP");
	}
}
