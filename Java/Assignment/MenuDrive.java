/*Write a program to display the menu of following,
a. Addition
b. Subtraction
c. Division
d. Multiplication
Print out the value based on the choice of user.*/

import java.util.Scanner;
class MenuDrive
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch,c;

		System.out.print("Enter Number num1 : ");
		int a = sc.nextInt();

		System.out.print("Enter Number num2 : ");
		int b = sc.nextInt();

		do
		{
			System.out.println("Choices You Have!");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();

			switch(ch)
			{
				case 1 : c = a + b;
					 System.out.println("Addition : "+c);
					 break;
					 
				case 2 : c = a - b;
					 System.out.println("Subtraction : "+c);
					 break;
					 
				case 3 : c = a * b;
					 System.out.println("Multiplication : "+c);
					 break;
					 
				case 4 : c = a / b;
					 System.out.println("Division : "+c);
					 break;
					 
				default : System.out.println("Invalid Choice!");		
			}//switch
		}while(ch!=5);
	}
}
