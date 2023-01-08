//2. Modify the above program with a user defined method to calculate the Area of a circle and print the value in Main.

import java.util.Scanner;
class AreaMeth
{
	public float areaOfCircle()
	{
		float PI = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of a Circle : ");
		float r = sc.nextFloat();
		float area = PI*r*r;
		return area;
	}
	public static void main(String[] args)
	{
		AreaMeth obj = new AreaMeth();
		float ar = obj.areaOfCircle();
		System.out.println("Area of a Circle is : "+ar);
	}
}
