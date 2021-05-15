package arrays;

import java.util.Scanner;

public class RightRotate 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("How many times you want to rotate the array?");
		int nor=s.nextInt();
		for(int i=0;i<=nor;i++)
		{
			int last=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println("The elements of the array after Rotating:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
