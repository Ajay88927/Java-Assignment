package arrays;

import java.util.Scanner;
public class LeftRotate 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The elements of the array are: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		System.out.println("How many times you want to rotate?");
		int nor=s.nextInt();
		
		int ind=a.length-1;
		for(int i=1;i<=nor;i++)
		{
			int first=a[0];
			for(int j=0;j<ind;j++)
			{
				a[j]=a[j+1];
			}
			a[ind]=first;
		}
		System.out.println("After Left Rotation: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}

}
