import java.util.Scanner;
class ForEachDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Array Size : ");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter Array Elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int ele : arr)
		{
			System.out.println(ele);
		}
	}
}
