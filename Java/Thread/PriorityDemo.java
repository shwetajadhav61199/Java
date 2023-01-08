class PriorityDemo extends Thread
{
	public void run()
	{
		System.out.println("Current Thread is : "+Thread.currentThread()+" Priority is : "+getPriority());
	}
	
	public static void main(String args[])
	{
		PriorityDemo p = new PriorityDemo();
		p.setPriority(Thread.NORM_PRIORITY);
		p.setPriority(Thread.MAX_PRIORITY);
		p.setPriority(Thread.MIN_PRIORITY);
		p.start();
	}
}
