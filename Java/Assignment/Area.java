//1. Write a program to Find the Area of a circle.

import java.util.Scanner;
class Area{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of a Circle : ");
		float rad = sc.nextFloat();
		double PI = 3.14f;
		
		float ar = (float)PI*rad*rad; //typecasting from double to float
		System.out.println("Area of a Circle is : "+ar);
	}
}
