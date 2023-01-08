class AliveDemo extends Thread
{
	AliveDemo(){
		start();
	}
	
	public void run()
	{
		try
		{
			System.out.println("Says Hello!");
			Thread.sleep(500);
			System.out.println("Says Bye!");
		}catch(InterruptedException ie)
		{
		}
	}
	
	public static void main(String args[])
	{
		AliveDemo a1 = new AliveDemo();
		AliveDemo a2 = new AliveDemo();
		System.out.println(a1.getName()+ " Alive Status : " +a1.isAlive());
		System.out.println(a2.getName()+ " Alive Status : " +a2.isAlive());
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException ie){}

		System.out.println(a1.getName()+ " Alive Status : " +a1.isAlive());
		System.out.println(a2.getName()+ " Alive Status : " +a2.isAlive());
	}
}
