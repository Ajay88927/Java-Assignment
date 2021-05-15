package arrays;

import java.util.Scanner;

public class InsertElement 
{
	public static int[] insertElementbyIndex(int[] a)
	{
		Scanner s=new Scanner(System.in);
		int[] b=new int[a.length+1];
		System.out.println("Enter the index at which you want to insert the element");
		int index=s.nextInt();
		System.out.println("Enter the element to insert");
		int element=s.nextInt();
		for (int i = 0; i < b.length-1; i++) 
		{
			if(i<index)
				b[i]=a[i];
			else
			b[i+1]=a[i];
		}
		b[index]=element;
		return b;
	}
	
public static void main(String[] args) 
{
	int[] a= {1,2,3,4};
	System.out.println("Before Inserting: ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	a=insertElementbyIndex(a);
	System.out.println("After Inserting the element:");
	for (int i = 0; i < a.length; i++) 
	{
		System.out.println(a[i]);
	}
}
}
