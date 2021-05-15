package arrays;

import java.util.Scanner;
public class Binary_Search
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the elemets of the array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		boolean b=false;
		
		for(int i=0;i<a.length-1;i++)
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
		
		System.out.println("Enter the key element to search in the given array: ");
		int key;
		key=s.nextInt();
		
		while(high>=low)
		{
			if(key==a[mid])
			{
				b=true;
				break;
			}
			else if(key>a[mid])
			{
				low=mid+1;
			}
			else
				high=mid-1;
			mid=(low+high)/2;
		}
	
		if(b==true)
		{
			System.out.println(key+ " is found in the index "+ mid);
		}
		else
			System.out.println(key+" is not found");
	}
}

	


