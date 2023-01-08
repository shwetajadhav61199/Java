//Write a program to check if the given number is the Biggest of given 3 numbers.

import java.util.Scanner;
class Biggest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Num 1 : ");
		int n1 = sc.nextInt();

		System.out.print("Enter Num 2 : ");
		int n2 = sc.nextInt();

		System.out.print("Enter Num 3 : ");
		int n3 = sc.nextInt();

		int max = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		//int bigger = (big > n3) ? big : n3;
		System.out.println("Biggest Number is : "+max);
	}
}
