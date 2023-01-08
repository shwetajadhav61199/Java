/*Design a class hierarchy for a simple 2D shape drawing application. The base class should
be Shape and it should have subclasses for Circle, Rectangle, and Triangle. Each shape
should have a method for calculating its area and a method for drawing itself.*/

class Shape
{
	int rad;
	float PI;
	//int side;

	Shape(int rad, float PI)
	{
		rad = 2;
		PI= 3.14f;
	}

	/*Shape(int side)
	{
		side = 5;
	}*/
}

class Circle extends Shape
{
	public void area(int rad)
	{
		this.rad = rad;
		float area = PI*rad*rad;
	}
	public float getArea()
	{
		return area;
	}
}

/*class Rectangle extends Shape
{
	public void area()
	{
	}
}

class Triangle extends Shape
{
	public void area()
	{
	}
}
*/
class Q2
{
	public static void main(String args[])
	{
		Shape s = new Shape(2,3.14f);
		s.area(2,3.14f);
		System.out.println(s.getArea());
	}
}
