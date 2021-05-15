package arrays;

import java.util.Scanner;
class Reverse1 
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
		
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k++;
		}
		System.out.println("The reversed array is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}