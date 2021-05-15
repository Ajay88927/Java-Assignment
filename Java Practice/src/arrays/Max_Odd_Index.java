package arrays;

import java.util.Scanner;
class Max_Odd_Index 
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

		int max=a[0];
		for (int i=0;i<n ;i++ )
		{
			if(i%2!=0)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		System.out.println("The Maximum of odd index elements of the array is: "+max);
	}
}
