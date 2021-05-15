package arrays;

import java.util.Scanner;
class Sum_Even_Index 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The elements of the array are: ");
		for (int i=0;i<n ;i++ )
		{
			System.out.println(a[i]);
		}

		int sum=0;
		for (int i=0;i<n ;i++ )
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("The Sum of even index elements of the array is: "+sum);
	}
}
