//11.Write a program to check if the given year is a leap year or not.

import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year : ");
		int year = sc.nextInt();
	if(((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
		{
			System.out.println(year+ " is Leap Year");
		}
		else
		{
			System.out.println(year+ " is not Leap Year");
		}
	}
}
