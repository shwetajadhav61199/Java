import java.util.Scanner;
class ArrDemo1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Array Size : ");
		int n = sc.nextInt();
		int m;
		int arr[] = new int[n];
		System.out.print("Enter an Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
