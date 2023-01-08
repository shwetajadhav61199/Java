abstract class Animal
{
	abstract void makesound();
}

class Dog extends Animal
{
	void makesound()
	{
		System.out.println("Barking!");
	}
}

class Lion extends Animal
{
	void makesound()
	{
		System.out.println("Roaring!");
	}
}

class AnimalDemo
{
	public static void main(String args[])
	{
		Animal a = new Dog();
		a.makesound();
		Animal b = new Lion();
		b.makesound();
	}
}
