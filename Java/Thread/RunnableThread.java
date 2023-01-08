class RunnableThread implements Runnable
{
	Thread t;
	public RunnableThread(String name)
	{
		t = new Thread(this,name);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(t.getName()+ " : "+i);
		}
	}
	public static void main(String rags[])
	{
		RunnableThread t1 = new RunnableThread("Thread 1");
		RunnableThread t2 = new RunnableThread("Thread 2");
		RunnableThread t3 = new RunnableThread("Thread 3");

		for(int i=0;i<=10;i++)
		{
			System.out.println("Main Thread : "+i);
		}
	}
}
