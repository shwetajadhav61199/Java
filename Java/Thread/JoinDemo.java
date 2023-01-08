class JoinDemo extends Thread
{
	int ts;
	JoinDemo(int ts)
	{
		this.ts = ts;
		start();
	}
	
	public void run()
	{
		try{
			for(int i=0;i<=5;i++)
			{
				System.out.println(getName()+" : "+i);
				Thread.sleep(ts);
			}
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		JoinDemo j1 = new JoinDemo(1000);
		JoinDemo j2 = new JoinDemo(1000);
		JoinDemo j3 = new JoinDemo(1000);
		
		try{
			j1.join();
			j2.join();
			j3.join();

		}catch(InterruptedException ie){}
		System.out.println("Main Exiting!");
		return;
	}
}
