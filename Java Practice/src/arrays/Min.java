package arrays;

import java.util.Scanner;
class Min 
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

		int min=a[0];
		for (int i=1;i<n ;i++ )
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The minimum element of the array is: "+min);
	}
}
