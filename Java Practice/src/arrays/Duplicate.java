package arrays;

import java.util.Scanner;
public class Duplicate 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The elements of the array are: ");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+ " ");
		}
		
		int ind=a.length-1; 
		for (int i = 0; i < ind; i++) 
		{
			for (int j = i+1; j < ind; j++) 
			{
				if(a[i]==a[j]) //if it's true, conclusion is a[j] is repeated 
				{
					for (int k = j; k < ind; k++)  // i should shift the elements
					{
						a[k]=a[k+1];
					}
					j--;    // as it is shifted again i should compare a[i] with a[j] 
					ind--;  // as one element is removed i am reducing the size (i.e ind)
				}
			}
		}
		
		System.out.println("After removing duplicates: ");
		
		
		/*for (int i = 0; i <=ind; i++) 
		{
			System.out.println(a[i]);
		}*/
		
		int[] b=new int[ind+1];
		for (int i = 0; i <=ind; i++) 
		{
			b[i]=a[i];
		}
		for (int i = 0; i <b.length; i++) 
		{
			System.out.println(b[i]+ " ");
		}
		
	}

}
