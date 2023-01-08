//Write a program to accept item number, item name, rate and quantity. Find price (rate * qty). Display item number, item name and price

import java.util.Scanner;
class Shop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an Item Name : ");
		String name = sc.nextLine();

		System.out.print("Enter an Item Number : ");
		int num = sc.nextInt();

		System.out.print("Enter an Item Rate : ");
		int rate = sc.nextInt();

		System.out.print("Enter an Item Qty : ");
		int qty = sc.nextInt();
		
		int price = rate*qty;
		System.out.println("Price of " +qty+ " Items is : "+price);
	}
}
