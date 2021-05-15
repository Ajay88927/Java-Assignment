package arrays;

import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size ofthe array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the elemets of the array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
