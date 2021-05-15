package arrays;

import java.util.Scanner;
class Sum 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The elements of the array are: ");
		for (int i=0;i<n ;i++ )
		{
			System.out.println(a[i]);
		}

		for (int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The summation of the given array is: "+sum);
	}
}
