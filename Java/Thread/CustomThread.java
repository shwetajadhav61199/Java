class CustomThread extends Thread
{
	public CustomThread(String name)
	{
		super(name);
	}

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(getName()+ " : "+i);
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException ie)
			{
				System.out.println("Interrupted Exception Occured!");
			}
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		CustomThread ct1 = new CustomThread("Thread One");
		CustomThread ct2 = new CustomThread("Thread Two");
		CustomThread ct3 = new CustomThread("Thread Three");
		ct1.start();
		ct2.start();
		ct3.start();
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Thread : "+i);
			try
			{
				Thread.slee(500);
			}catch(InterruptedException ie)
			{
				System.out.println("Interrupted Exception Occured!");
			}
		}
	}
}
