package arrays;

import java.util.Scanner;

public class PrimeCount 
{
	public static int countPrimenumbers(int[] a)
	{
		int primecount=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			int m=a[i];
			for (int j = 2; j <=m/2; j++) 
			{
				if(m%j==0)
				{
					count++;
					break;
				}
			}
			if(m!=1 && count==0)
				primecount++;
		}
		return primecount;
	}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=s.nextInt();
	int[] a=new int[size];
	System.out.println("Enter the elements of the array");
	for (int i = 0; i < a.length; i++) 
	{
		a[i]=s.nextInt();
	}
	System.out.println("The number of prime numbers in the given array are: "+countPrimenumbers(a));
}
}
